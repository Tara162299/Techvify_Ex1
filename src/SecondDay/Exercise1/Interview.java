package SecondDay.Exercise1;
import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface questionGenerator {
    List<Question> questionGenerator(List<Question> filterLanguageQuestionList, Interviewee interviewee);
}

@FunctionalInterface
interface languageFilter {
    List<Question> languageFilter(Interviewee interviewee);
}

public class Interview implements questionGenerator, languageFilter {


    @Override
    public List<Question> languageFilter(Interviewee interviewee) {
        String userLanguage = interviewee.language();

        return switch (userLanguage) {
            case "Java" ->
                    Data.listQuestion().stream().filter(q -> Objects.equals(q.getLanguage(), "Java")).collect(Collectors.toList());
            case "ReactJS" ->
                    Data.listQuestion().stream().filter(q -> Objects.equals(q.getLanguage(), "ReactJS")).collect(Collectors.toList());
            default -> new ArrayList<>();
        };
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
                for (int i = 0; i < 4; i++) {
                    tempJunior = juniorQuestionList.stream().skip(random.nextInt(juniorQuestionList.size())).findFirst().get();
                    checkDupQuestion(resultQuestionList, tempJunior);
                    //resultQuestionList.add(tempJunior);
                }
                tempSenior = seniorQuestionList.stream().skip(random.nextInt(seniorQuestionList.size())).findFirst().get();
                resultQuestionList.add(tempSenior);
                break;

            case "Mid-senior":
                for (int i = 0; i < 2; i++) {
                    tempJunior = juniorQuestionList.stream().skip(random.nextInt(juniorQuestionList.size())).findFirst().get();
                    resultQuestionList.add(tempJunior);
                }

                for (int i = 0; i < 3; i++) {
                    tempSenior = seniorQuestionList.stream().skip(random.nextInt(seniorQuestionList.size())).findFirst().get();
                    resultQuestionList.add(tempSenior);
                }
                break;

            case "Senior":
                for (int i = 0; i < 5; i++) {
                    tempSenior = seniorQuestionList.stream().skip(random.nextInt(seniorQuestionList.size())).findFirst().get();
                    resultQuestionList.add(tempSenior);
                }
                break;
        }
        return resultQuestionList;
    }

    public void checkDupQuestion(List<Question> questionList, Question question) {
        boolean checkDup = false;

        for (Question temp : questionList) {
            if (temp.equals(question)) {
                checkDup = true;
            }
        }

        if (!checkDup) {
            questionList.add(question);
        }
    }
}
