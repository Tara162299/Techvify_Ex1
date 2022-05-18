package SecondDay.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Question> questionJavaList = new ArrayList<>();

    public static List<Question> listQuestion() {

        questionJavaList.add(new Question(1, "Cac dac tinh OOP la gi?", "Junior", "Java"));
        questionJavaList.add(new Question(2, "Primative variable la gi?", "Junior", "Java"));
        questionJavaList.add(new Question(3, "Neu cac diem khac nhau giua List va Set?", "Junior", "Java"));
        questionJavaList.add(new Question(4, "Cac dac tinh OOP la gi?", "Senior", "Junior"));
        questionJavaList.add(new Question(5, "Primative variable la gi?", "Junior", "Java"));
        questionJavaList.add(new Question(6, "Neu cac diem khac nhau giua List va Set?", "Senior", "Java"));
        questionJavaList.add(new Question(7, "Cac dac tinh OOP la gi?", "Senior", "Java"));
        questionJavaList.add(new Question(8, "Primative variable la gi?", "Senior", "Java"));
        questionJavaList.add(new Question(9, "Neu cac diem khac nhau giua List va Set?", "Senior", "Java"));
        questionJavaList.add(new Question(10, "Cac dac tinh OOP la gi?", "Senior", "Java"));

        questionJavaList.add(new Question(11, "Chi ra nhung diem moi cua ES6", "Junior", "ReactJS"));
        questionJavaList.add(new Question(12, "Liet ke ra cac component life cycle?", "Junior", "ReactJS"));
        questionJavaList.add(new Question(13, "Props la gi?", "Junior", "ReactJS"));
        questionJavaList.add(new Question(14, "State la gi?", "Junior", "ReactJS"));
        questionJavaList.add(new Question(15, "Chi ra nhung diem moi cua ES6", "Junior", "ReactJS"));
        questionJavaList.add(new Question(16, "Liet ke ra cac component life cycle?", "Senior", "ReactJS"));
        questionJavaList.add(new Question(17, "Props la gi?", "Senior", "ReactJS"));
        questionJavaList.add(new Question(18, "State la gi?", "Senior", "ReactJS"));
        questionJavaList.add(new Question(19, "Props la gi?", "Senior", "ReactJS"));
        questionJavaList.add(new Question(20, "State la gi?", "Senior", "ReactJS"));

        return questionJavaList;
    }
}