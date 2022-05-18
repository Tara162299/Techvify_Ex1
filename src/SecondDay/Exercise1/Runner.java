package SecondDay.Exercise1;

public class Runner {
    public static void main(String[] args) {
        Interview interview = new Interview();

        Interviewee people1 = new Interviewee("Quinton", "Junior", "Java");
        Interviewee people2 = new Interviewee("Tara", "Senior", "ReactJS");
        Interviewee people3 = new Interviewee("Martin", "Mid-senior", "ReactJS");

        System.out.println("Questions for interviewee " + people1.name() + " (" + people1.level() + ", " + people1.language() + ")" + " are: ");
        for (Question question : interview.questionGenerator(interview.languageFilter(people1), people1)) {
            System.out.println(question.toString());
        }
        System.out.println("---------------------------------------------------------");

        System.out.println("Questions for interviewee " + people2.name() + " (" + people2.level() + ", " + people2.language() + ")" + " are: ");
        for (Question question : interview.questionGenerator(interview.languageFilter(people2), people2)) {
            System.out.println(question.toString());
        }
        System.out.println("---------------------------------------------------------");

        System.out.println("Questions for interviewee " + people3.name() + " (" + people3.level() + ", " + people3.language() + ")" + " are: ");
        for (Question question : interview.questionGenerator(interview.languageFilter(people3), people3)) {
            System.out.println(question.toString());
        }
    }
}
