package SecondDay.Exercise1;

public class Interviewee {
    private String name;
    private String level;

    private String language;

    public Interviewee(String name, String level, String language) {
        this.name = name;
        this.level = level;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
