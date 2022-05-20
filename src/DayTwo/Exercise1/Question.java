package DayTwo.Exercise1;

import DayTwo.Exercise1.Language.Java;
import DayTwo.Exercise1.Language.Language;

public class Question {
    private final int questionCode;
    private final String questionName;
    private final String questionLevel;
    private final Language language;

    public Question(int questionCode, String questionName, String questionLevel, Language language) {
        this.questionCode = questionCode;
        this.questionName = questionName;
        this.questionLevel = questionLevel;
        this.language = language;
    }

    public int getQuestionCode() {
        return questionCode;
    }

    public String getQuestionLevel() {
        return questionLevel;
    }

    public String getLanguage() {
        return language.getName();
    }

    public String toString() {
        if (language.getName() == "Java") {
            return "Question code: " + questionCode + "| Content: " + questionName
                    + "| Level: " + questionLevel + "| Language: " + language.getName() + " "
                    +  ((Java) language).languageVersion() + " |Language code: " + language.getCode();
        }
        return "Question code: " + questionCode + "| Content: " + questionName
                + "| Level: " + questionLevel + "| Language: " + language.getName()
                + " |Language code: " + language.getCode();
    }


}
