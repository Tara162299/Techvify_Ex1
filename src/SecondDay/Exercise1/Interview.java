package SecondDay.Exercise1;
import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface questionGenerator {
    void questionGenerator(List<Question> filterLanguageQuestionList, Interviewee interviewee);
}

@FunctionalInterface
interface languageFilter {
    List<Question> languageFilter(Interviewee interviewee);
}

public class Interview implements questionGenerator, languageFilter {
    private Interviewee interviewee;

    public Interview(Interviewee interviewee) {
        this.interviewee = interviewee;
    }

    @Override
    public List<Question> languageFilter(Interviewee interviewee) {
        String userLanguage = interviewee.getLanguage();
        List<Question> filterLanguageQuestionList = new ArrayList<>();

        switch (userLanguage) {
            case "Java":
                filterLanguageQuestionList = Data.listQuestion().stream().filter(q -> Objects.equals(q.getLanguage(), "Java")).collect(Collectors.toList());
                break;
            case "ReactJS":
                filterLanguageQuestionList = Data.listQuestion().stream().filter(q -> Objects.equals(q.getLanguage(), "ReactJS")).collect(Collectors.toList());
                break;
        }
        return filterLanguageQuestionList;
    }


    @Override
    public void questionGenerator(List<Question> filterLanguageQuestionList, Interviewee interviewee) {
        List<Question> resultQuestionList = new ArrayList<>();

        switch (interviewee.getLevel()) {
            case "Junior":
                resultQuestionList = Data.listQuestion().stream().filter(q -> Objects.equals(q.getQuestionLevel(), "Junior")).collect(Collectors.toList());
                break;
            case "Mid-senior":
                resultQuestionList = Data.listQuestion().stream().filter(q -> Objects.equals(q.getQuestionLevel(), "Mid-senior")).collect(Collectors.toList());
                break;
            case "Senior":
                resultQuestionList = Data.listQuestion().stream().filter(q -> Objects.equals(q.getQuestionLevel(), "Senior")).collect(Collectors.toList());
                break;
        }
    }
}
