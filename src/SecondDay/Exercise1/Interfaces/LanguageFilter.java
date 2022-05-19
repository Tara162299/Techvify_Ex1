package SecondDay.Exercise1.Interfaces;

import SecondDay.Exercise1.Interviewee;
import SecondDay.Exercise1.Question;

import java.util.List;

@FunctionalInterface
public interface LanguageFilter {
    List<Question> languageFilter(Interviewee interviewee);
}
