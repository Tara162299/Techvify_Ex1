package SecondDay.Exercise1;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface QuestionGenerator {
    List<Question> questionGenerator(List<Question> filterLanguageQuestionList, Interviewee interviewee);
}

@FunctionalInterface
interface LanguageFilter {
    List<Question> languageFilter(Interviewee interviewee);
}

public class Interview implements QuestionGenerator, LanguageFilter {

    @Override
    public List<Question> languageFilter(Interviewee interviewee) {
        List<Question> languageFilterList;
        languageFilterList = Data.listQuestion().stream().filter(q -> q.getLanguage().equals(interviewee.language())).collect(Collectors.toList());

        return languageFilterList;
    }


    @Override
    public List<Question> questionGenerator(List<Question> filterLanguageQuestionList, Interviewee interviewee) {
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
}
