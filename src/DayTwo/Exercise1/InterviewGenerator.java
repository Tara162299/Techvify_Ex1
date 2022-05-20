package DayTwo.Exercise1;
import DayTwo.Exercise1.Interfaces.LanguageFilter;
import DayTwo.Exercise1.Interfaces.getQuestionList;

import java.util.*;
import java.util.stream.*;

public class InterviewGenerator implements getQuestionList, LanguageFilter {

    @Override
    public List<Question> languageFilter(Interviewee interviewee) {
        List<Question> languageFilterList;
        languageFilterList = Data.getQuestionList().stream().filter(q -> q.getLanguage().equals(interviewee.language())).collect(Collectors.toList());

        return languageFilterList;
    }
    public void checkDupQuestion(List<Question> questionList, Question question) {
        boolean isDup = false;

        for (Question temp : questionList) {
            if (question.getQuestionCode() == temp.getQuestionCode()) {
                isDup = true;
                break;
            }
        }
        if (!isDup) {
            questionList.add(question);
        }
    }

    public List<Question> createQuestionList(List<Question> languageFilter, String level, int numOfQuestion) {
        Question question;

        List<Question> questionList = languageFilter.stream().
                filter(q -> q.getQuestionLevel().equals(level)).toList();

        List<Question> QuestionList = new ArrayList<>();

        Random random = new Random();
        while (QuestionList.size() < numOfQuestion) {
            question = questionList.stream().skip(random.nextInt(questionList.size())).findFirst().get();

            if (QuestionList.size() == 0) {
                QuestionList.add(question);
            }
            else {
                checkDupQuestion(QuestionList, question);
            }
        }
        return QuestionList;
    }
    @Override
    public List<Question> getQuestionList(List<Question> filterLanguageQuestionList, Interviewee interviewee) {
        List<Question> resultQuestionList = new ArrayList<>();
        List<Question> questionGeneratorJunior;
        List<Question> questionGeneratorSenior;

        switch (interviewee.level()) {
            case "Junior" -> {
                questionGeneratorJunior = createQuestionList(filterLanguageQuestionList, "Junior", 4);
                questionGeneratorSenior = createQuestionList(filterLanguageQuestionList, "Senior", 1);
                resultQuestionList.addAll(questionGeneratorJunior);
                resultQuestionList.addAll(questionGeneratorSenior);
            }
            case "Mid-senior" -> {
                questionGeneratorJunior = createQuestionList(filterLanguageQuestionList, "Junior", 2);
                questionGeneratorSenior = createQuestionList(filterLanguageQuestionList, "Senior", 3);
                resultQuestionList.addAll(questionGeneratorJunior);
                resultQuestionList.addAll(questionGeneratorSenior);
            }
            case "Senior" -> {
                questionGeneratorSenior = createQuestionList(filterLanguageQuestionList, "Senior", 5);
                resultQuestionList.addAll(questionGeneratorSenior);
            }
        }

        return resultQuestionList;
    }
}