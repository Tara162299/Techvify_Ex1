package FirstDay.Ex3_Upcasting;

public class Runner {
    public static void main(String[] args) {
        Language l1 = new English();
        Language l2 = new Vietnamese();
        English l3 = new English();

        l1.sayHello();
        l2.sayHello();
        l3.goodBye();


    }

}
