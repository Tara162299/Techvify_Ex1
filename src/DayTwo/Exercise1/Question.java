package DayTwo.Exercise1;

public class Question {
    private final int questionCode;
    private final String questionName;
    private final String questionLevel;
    private final String language;

    public Question(int questionCode, String questionName, String questionLevel, String language) {
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
        return language;
    }

    public String toString() {
        return "Question code: " + questionCode + "| Content: " + questionName
                + "| Level: " + questionLevel + "| Language: " + language;
    }
}
