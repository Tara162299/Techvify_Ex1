package SecondDay.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Language> languageList = new ArrayList<>();
    Language Java = new Language(1, "Java");
    Language ReactJS = new Language(2, "ReactJS");


    public static List<Question> questionJavaList = new ArrayList<>();
    Question question1 = new Question(1, "Các đặc tính OOP là gì?", "Junior", "Java");
    Question question2 = new Question(1, "Primative variable là gì?", "Junior", "Java");
    

    public static List<Question> addLanguage(List<Question> list, Question question) {
        list.add(question);
        return list;
    }
}