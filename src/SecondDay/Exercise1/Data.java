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
        Question question1 = new Question(1, "Các đặc tính OOP là gì?", "Senior", "Java");
        Question question2 = new Question(2, "Primative variable là gì?", "Mid senior", "Java");
        Question question3 = new Question(3, "Nêu các điểm khác nhau giữa List và Set?", "Junior", "Java");

        Question question4 = new Question(4, "Chỉ ra những điểm mới của ES6", "Senior", "ReactJS");
        Question question5 = new Question(5, "Liệt kê ra các component life cycle?", "Mid senior", "ReactJS");
        Question question6 = new Question(6, "Props là gì?", "Junior", "ReactJS");
        Question question7 = new Question(7, "State là gì?", "Junior", "ReactJS");

        questionJavaList.add(question1);
        questionJavaList.add(question2);
        questionJavaList.add(question3);
        questionJavaList.add(question4);
        questionJavaList.add(question5);
        questionJavaList.add(question6);
        questionJavaList.add(question7);
        return questionJavaList;
    }
}