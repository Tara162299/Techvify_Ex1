package DayTwo.Exercise1.Language;

import DayTwo.Exercise1.Interfaces.languageVersion;

public class Java extends Language implements languageVersion {

    private final String version;

    public Java(String name, String code, String version) {
        super(name, code);
        this.version = version;
    }

    @Override
    public String languageVersion() {
        return version;
    }
}
