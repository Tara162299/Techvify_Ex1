package DayOne.Ex3_Upcasting;

public class English extends Language{
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void goodBye() {
        System.out.println("Goodbye!");
    }
}
