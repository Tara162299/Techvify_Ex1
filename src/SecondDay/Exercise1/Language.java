package SecondDay.Exercise1;

public class Language {
    private final int languageCode;
    private final String languageName;

    public Language(int languageCode, String languageName) {
        this.languageCode = languageCode;
        this.languageName = languageName;
    }
    public String toString() {
        return "Language: " + languageName + "| Code: " + languageCode;
    }
}
