package SecondDay.Exercise1;

public class Runner {
    public static void main(String[] args) {

        for (Language language : Data.listLanguage()) {
            System.out.println(language.toString());
        }

        for (Question question : Data.listQuestion()) {
            System.out.println(question.toString());
        }
    }
}
