package DayTwo.Exercise1.Language;

public class Language {
    private final String code;
    private final String name;

    public Language(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
