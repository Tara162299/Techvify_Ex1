package SecondDay.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Question> questionJavaList = new ArrayList<>();

    public static List<Question> listQuestion() {
        Question question1 = new Question(1, "Cac dac tinh OOP la gi?", "Junior", "Java");
        Question question2 = new Question(2, "Primative variable la gi?", "Junior", "Java");
        Question question3 = new Question(3, "Neu cac diem khac nhau giua List va Set?", "Junior", "Java");
        Question question4 = new Question(4, "Cac dac tinh OOP la gi?", "Senior", "Junior");
        Question question5 = new Question(5, "Primative variable la gi?", "Junior", "Java");
        Question question6 = new Question(6, "Neu cac diem khac nhau giua List va Set?", "Senior", "Java");
        Question question7 = new Question(7, "Cac dac tinh OOP la gi?", "Senior", "Java");
        Question question8 = new Question(8, "Primative variable la gi?", "Senior", "Java");
        Question question9 = new Question(9, "Neu cac diem khac nhau giua List va Set?", "Senior", "Java");
        Question question10 = new Question(10, "Cac dac tinh OOP la gi?", "Senior", "Java");

        Question question11 = new Question(11, "Chi ra nhung diem moi cua ES6", "Junior", "ReactJS");
        Question question12 = new Question(12, "Liet ke ra cac component life cycle?", "Junior", "ReactJS");
        Question question13 = new Question(13, "Props la gi?", "Junior", "ReactJS");
        Question question14 = new Question(14, "State la gi?", "Junior", "ReactJS");
        Question question15 = new Question(15, "Chi ra nhung diem moi cua ES6", "Junior", "ReactJS");
        Question question16 = new Question(16, "Liet ke ra cac component life cycle?", "Senior", "ReactJS");
        Question question17 = new Question(17, "Props la gi?", "Senior", "ReactJS");
        Question question18 = new Question(18, "State la gi?", "Senior", "ReactJS");
        Question question19 = new Question(19, "Props la gi?", "Senior", "ReactJS");
        Question question20 = new Question(20, "State la gi?", "Senior", "ReactJS");

        questionJavaList.add(question1);
        questionJavaList.add(question2);
        questionJavaList.add(question3);
        questionJavaList.add(question4);
        questionJavaList.add(question5);
        questionJavaList.add(question6);
        questionJavaList.add(question7);
        questionJavaList.add(question8);
        questionJavaList.add(question9);
        questionJavaList.add(question10);
        questionJavaList.add(question11);
        questionJavaList.add(question12);
        questionJavaList.add(question13);
        questionJavaList.add(question14);
        questionJavaList.add(question15);
        questionJavaList.add(question16);
        questionJavaList.add(question17);
        questionJavaList.add(question19);
        questionJavaList.add(question20);

        return questionJavaList;
    }
}