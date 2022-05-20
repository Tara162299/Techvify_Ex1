package DayTwo.Exercise1.Interfaces;

import DayTwo.Exercise1.Interviewee;
import DayTwo.Exercise1.Question;

import java.util.List;

@FunctionalInterface
public interface LanguageFilter {
    List<Question> languageFilter(Interviewee interviewee);
}
