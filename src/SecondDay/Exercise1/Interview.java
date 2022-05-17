package SecondDay.Exercise1;
@FunctionalInterface
interface interviewTemplate {
    void questionGenerator(Interviewee interviewee);
}

public class Interview implements interviewTemplate{
    private Interviewee interviewee;

    public Interview(Interviewee interviewee) {
        this.interviewee = interviewee;
    }
    @Override
    public void questionGenerator(Interviewee interviewee) {

    }
}
