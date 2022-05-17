package SecondDay.Lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Interface {
    String concat(String a, String b);
}

public class Runner{
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("H");
        stringList.add("e");
        stringList.add("l");
        stringList.add("l");
        stringList.add("o");
        stringList.add("!");

        stringList.forEach((String n) -> {System.out.println(n);});

        Interface test = (x, y) -> (x + y);
        System.out.println(test.concat("Yass! ", "Let's go!"));
    }

}
