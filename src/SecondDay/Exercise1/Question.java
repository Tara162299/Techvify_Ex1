package SecondDay.Exercise1;

public class Question {
    private int questionCode;
    private String questionName;
    private String questionLevel;
    private String language;

    public Question(int questionCode, String questionName, String questionLevel, String language) {
        this.questionCode = questionCode;
        this.questionName = questionName;
        this.questionLevel = questionLevel;
        this.language = language;
    }

    public int getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(int questionCode) {
        this.questionCode = questionCode;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(String questionLevel) {
        this.questionLevel = questionLevel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String toString() {
        return "Question code: " + questionCode + "| Content: " + questionName
                + "| Level: " + questionLevel + "| Language: " + language;
    }
}
