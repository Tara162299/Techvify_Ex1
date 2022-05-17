package FirstDay.Ex4_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menuChoice {
    public static List<People> peopleList = new ArrayList<>();

    public void menuChoice(String choice) {
        Scanner scan = new Scanner(System.in);


        switch (choice) {
            case "Create and add a new person":
                peopleList.add(createNewPerson());

                for (People people : peopleList) {
                    System.out.println(people.toString());
                }

                System.out.println("""
                        Please choose an option:\s
                                        
                        Create and add a new person
                        Edit person info
                        Delete a person
                        Exit""");

                break;

            case "Edit person info":
                System.out.println("""
                        Please choose a person by the following fields to be edited:\s
                        Name
                        Company name
                        YoE
                        Rating
                        Exit""");
                String personFilterChoice = scan.nextLine();

                People searchPerson = searchPeople(personFilterChoice);
                System.out.println("""
                        Please choose a field to be edited:\s
                        Name
                        Company name
                        YoE
                        Rating
                        Exit""");
                String editChoice = scan.nextLine();
                editPerson(searchPerson, editChoice);

                System.out.println("""
                        Please choose an option:\s
                                        
                        Create and add a new person
                        Edit person info
                        Delete a person
                        Exit""");
                break;

            case "Delete a person":
                break;
            case "Exit":
                System.exit(0);
        }
    }


    public People searchPeople(String choice) {
        Scanner scan = new Scanner(System.in);
        People temp = new People();


        switch (choice) {
            case "Name" -> {
                String searchName = scan.nextLine();
                for (People people : peopleList) {
                    if (searchName.equals(people.getName())) {
                        return people;
                    }
                }
            }
            case "Company name" -> {
                String searchComName = scan.nextLine();
                for (People people : peopleList) {
                    if (searchComName.equals(people.getCompany())) {
                        return people;
                    }
                }
            }
            case "YoE" -> {
                int searchYoE = scan.nextInt();
                for (People people : peopleList) {
                    if (searchYoE == people.getYearOfExp()) {
                        return people;
                    }
                }
            }
            case "Rating" -> {
                double searchRating = scan.nextDouble();
                for (People people : peopleList) {
                    if (searchRating == people.getRating()) {
                        return people;
                    }
                }
            }
            case "Exit" -> System.exit(0);
        }
        return null;
    }

    public People createNewPerson() {
        Scanner scan = new Scanner(System.in);
        People people = new People();

        System.out.println("Please enter the name for the person :");
        String name = scan.next();
        people.setName(name);

        System.out.println("Please enter the company name for the person :");
        String companyName = scan.next();
        people.setCompany(companyName);

        System.out.println("Please enter the year of experience for the person :");
        int yearOfExp = scan.nextInt();
        people.setYearOfExp(yearOfExp);

        System.out.println("Please enter the rating for the person : (Out of 10)");
        double rating = scan.nextDouble();
        people.setRating(rating);

        return people;
    }

    public void editPerson(People people, String choice) {
        Scanner scan = new Scanner(System.in);
        switch (choice) {
            case "Name" -> {
                System.out.println("Please enter the new name for the selected person: ");
                String newName = scan.nextLine();
                people.setName(newName);
            }
            case "Company name" -> {
                System.out.println("Please enter the new company name for the selected person: ");
                String newCompanyName = scan.nextLine();
                people.setCompany(newCompanyName);
            }
            case "YoE" -> {
                System.out.println("Please enter the updated experience year for the selected person: ");
                int newYoe = scan.nextInt();
                people.setYearOfExp(newYoe);
            }
            case "Rating" -> {
                System.out.println("Please enter the rating for the selected person: ");
                double newRating = scan.nextDouble();
                people.setRating(newRating);
            }
        }
    }
}
