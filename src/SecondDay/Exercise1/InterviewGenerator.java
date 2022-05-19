package SecondDay.Exercise1;
import SecondDay.Exercise1.Interfaces.LanguageFilter;
import SecondDay.Exercise1.Interfaces.QuestionGenerator;

import java.util.*;
import java.util.stream.*;

public class InterviewGenerator implements QuestionGenerator, LanguageFilter {

    @Override
    public List<Question> languageFilter(Interviewee interviewee) {
        List<Question> languageFilterList;
        languageFilterList = Data.listQuestion().stream().filter(q -> q.getLanguage().equals(interviewee.language())).collect(Collectors.toList());

        return languageFilterList;
    }


    @Override
    public List<Question> oldQuestionGenerator(List<Question> filterLanguageQuestionList, Interviewee interviewee) {
        List<Question> seniorQuestionList = filterLanguageQuestionList.stream().
                filter(q -> Objects.equals(q.getQuestionLevel(), "Senior")).toList();

        List<Question> juniorQuestionList = filterLanguageQuestionList.stream().
                filter(q -> Objects.equals(q.getQuestionLevel(), "Junior")).toList();

        List<Question> resultQuestionList = new ArrayList<>();

        Random random = new Random();
        Question tempJunior;
        Question tempSenior;

        switch (interviewee.level()) {
            case "Junior":
                while (resultQuestionList.size() < 4) {
                    tempJunior = juniorQuestionList.stream().skip(random.nextInt(juniorQuestionList.size())).findFirst().get();
                    if (resultQuestionList.size() == 0) {
                        resultQuestionList.add(tempJunior);
                    } else {
                        checkDupQuestion(resultQuestionList, tempJunior);
                    }
                }
                tempSenior = seniorQuestionList.stream().skip(random.nextInt(seniorQuestionList.size())).findFirst().get();
                resultQuestionList.add(tempSenior);
                break;

            case "Mid-senior":
                while (resultQuestionList.size() < 2) {
                    tempJunior = juniorQuestionList.stream().skip(random.nextInt(juniorQuestionList.size())).findFirst().get();
                    if (resultQuestionList.size() == 0) {
                        resultQuestionList.add(tempJunior);
                    } else {
                        checkDupQuestion(resultQuestionList, tempJunior);
                    }
                }

                while (resultQuestionList.size() < 5) {
                    tempSenior = seniorQuestionList.stream().skip(random.nextInt(seniorQuestionList.size())).findFirst().get();
                    checkDupQuestion(resultQuestionList, tempSenior);
                }
                break;

            case "Senior":
                while (resultQuestionList.size() < 5) {
                    tempSenior = seniorQuestionList.stream().skip(random.nextInt(seniorQuestionList.size())).findFirst().get();
                    if (resultQuestionList.size() == 0) {
                        resultQuestionList.add(tempSenior);
                    } else {
                        checkDupQuestion(resultQuestionList, tempSenior);
                    }
                }
                break;
        }
        return resultQuestionList;
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

    public List<Question> questionGenerator(List<Question> languageFilter, String level, int numOfQuestion) {
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

    public List<Question> getQuestionList(List<Question> filterLanguageQuestionList, Interviewee interviewee) {
        List<Question> resultQuestionList = new ArrayList<>();
        List<Question> questionGeneratorJunior;
        List<Question> questionGeneratorSenior;

        switch (interviewee.level()) {
            case "Junior" -> {
                questionGeneratorJunior = questionGenerator(filterLanguageQuestionList, "Junior", 4);
                questionGeneratorSenior = questionGenerator(filterLanguageQuestionList, "Junior", 1);
                resultQuestionList.addAll(questionGeneratorJunior);
                resultQuestionList.addAll(questionGeneratorSenior);
            }
            case "Mid-senior" -> {
                questionGeneratorJunior = questionGenerator(filterLanguageQuestionList, "Junior", 2);
                questionGeneratorSenior = questionGenerator(filterLanguageQuestionList, "Senior", 3);
                resultQuestionList.addAll(questionGeneratorJunior);
                resultQuestionList.addAll(questionGeneratorSenior);
            }
            case "Senior" -> {
                questionGeneratorSenior = questionGenerator(filterLanguageQuestionList, "Senior", 5);
                resultQuestionList.addAll(questionGeneratorSenior);
            }
        }

        return resultQuestionList;
    }
}
