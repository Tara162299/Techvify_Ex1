package DayTwo.Exercise1.Language;

import DayTwo.Exercise1.Interfaces.languageVersion;

public class Java extends Language implements languageVersion {

    private final int version;

    public Java(int code, int version) {
        super(code);
        this.version = version;
    }

    public String getName() {
        return "Java";
    }

    @Override
    public int languageVersion() {
        return version;
    }
}
