package SecondDay.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Language> languageList = new ArrayList<>();
    public static List<Question> questionJavaList = new ArrayList<>();

    public static List<Language> listLanguage() {
        Language Java = new Language(1, "Java");
        Language ReactJS = new Language(2, "ReactJS");

        languageList.add(Java);
        languageList.add(ReactJS);
        return languageList;
    }

    public static List<Question> listQuestion() {
        Question question1 = new Question(1, "Các đặc tính OOP là gì?", "Junior", "Java");

        Question question2 = new Question(2, "Primative variable là gì?", "Junior", "Java");
        questionJavaList.add(question1);
        questionJavaList.add(question2);
        return questionJavaList;
    }
}