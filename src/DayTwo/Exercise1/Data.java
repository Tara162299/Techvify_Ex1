package DayTwo.Exercise1;

import DayTwo.Exercise1.Language.Java;
import DayTwo.Exercise1.Language.ReactJS;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Question> questionJavaList = new ArrayList<>();
    private static void createQuestionList() {
        Java javaCore = new Java("Java", "1.1", "Core");
        Java javaFx = new Java("Java", "1.2", "Fx");
        ReactJS reactJS = new ReactJS("ReactJS", "2");

        questionJavaList.add(new Question(1, "Cac dac tinh OOP la gi?", "Junior", javaCore));
        questionJavaList.add(new Question(2, "Primative variable la gi?", "Junior", javaCore));
        questionJavaList.add(new Question(3, "Neu cac diem khac nhau giua List va Set?", "Junior", javaCore));
        questionJavaList.add(new Question(4, "Cac dac tinh OOP la gi?", "Junior", javaCore));
        questionJavaList.add(new Question(5, "Primative variable la gi?", "Junior", javaCore));
        questionJavaList.add(new Question(6, "Neu cac diem khac nhau giua List va Set?", "Senior", javaCore));
        questionJavaList.add(new Question(7, "Cac dac tinh OOP la gi?", "Senior", javaCore));
        questionJavaList.add(new Question(8, "Primative variable la gi?", "Senior", javaCore));
        questionJavaList.add(new Question(9, "Neu cac diem khac nhau giua List va Set?", "Senior", javaCore));
        questionJavaList.add(new Question(10, "Cac dac tinh OOP la gi?", "Senior", javaCore));

        questionJavaList.add(new Question(11, "Neu cac diem khac nhau giua List va Set?", "Junior", javaFx));
        questionJavaList.add(new Question(12, "Cac dac tinh OOP la gi?", "Junior", javaFx));
        questionJavaList.add(new Question(13, "Primative variable la gi?", "Junior", javaFx));
        questionJavaList.add(new Question(14, "Neu cac diem khac nhau giua List va Set?", "Senior", javaFx));
        questionJavaList.add(new Question(15, "Cac dac tinh OOP la gi?", "Senior", javaFx));

        questionJavaList.add(new Question(16, "Chi ra nhung diem moi cua ES6", "Junior", reactJS));
        questionJavaList.add(new Question(17, "Liet ke ra cac component life cycle?", "Junior", reactJS));
        questionJavaList.add(new Question(18, "Props la gi?", "Junior", reactJS));
        questionJavaList.add(new Question(19, "State la gi?", "Junior", reactJS));
        questionJavaList.add(new Question(20, "Chi ra nhung diem moi cua ES6", "Junior", reactJS));
        questionJavaList.add(new Question(21, "Liet ke ra cac component life cycle?", "Senior", reactJS));
        questionJavaList.add(new Question(22, "Props la gi?", "Senior", reactJS));
        questionJavaList.add(new Question(23, "State la gi?", "Senior", reactJS));
        questionJavaList.add(new Question(24, "Props la gi?", "Senior", reactJS));
        questionJavaList.add(new Question(25, "State la gi?", "Senior", reactJS));


    }

    public static List<Question> getQuestionList() {
        if (questionJavaList.size() == 0) {
            createQuestionList();
        }
        return questionJavaList;
    }

}