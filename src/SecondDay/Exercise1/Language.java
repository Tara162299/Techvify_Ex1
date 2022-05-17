package SecondDay.Exercise1;

public class Language {
    private int languageCode;
    private String languageName;

    public Language(int languageCode, String languageName) {
        this.languageCode = languageCode;
        this.languageName = languageName;
    }

    public int getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(int languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
