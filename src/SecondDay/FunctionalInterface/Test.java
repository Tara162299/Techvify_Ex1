package SecondDay.FunctionalInterface;

@FunctionalInterface
public interface Test{

    // single abstract method
    public String process(String input);

    public default void printf(Object t){
        System.out.println(t);
    }

    public static String concat(String a, String b){
        return a + b;
    }
}
