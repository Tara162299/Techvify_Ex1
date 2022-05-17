package FirstDay.Ex4_Collection;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Please choose an option:\s
                
                Create and add a new person
                Edit person info
                Delete a person
                Exit""");

        menuChoice menu = new menuChoice();
        while (true) {
            String choice = scan.nextLine();
            menu.menuChoice(choice);
        }
    }
}
