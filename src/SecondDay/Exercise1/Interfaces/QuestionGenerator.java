package SecondDay.Exercise1.Interfaces;

import SecondDay.Exercise1.Interviewee;
import SecondDay.Exercise1.Question;

import java.util.List;

@FunctionalInterface
public interface QuestionGenerator {
    List<Question> oldQuestionGenerator(List<Question> filterLanguageQuestionList, Interviewee interviewee);
}
