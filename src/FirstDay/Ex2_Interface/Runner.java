package FirstDay.Ex2_Interface;

public class Runner {
    public static void main(String[] args) {
        People p1 = new People();
        p1.setName("Quinton");
        p1.setCompany("Techvify");
        p1.yearOfExp(5);

        People p2 = new People("Martin", "");
        p1.yearOfExp(1);

        p1.isTechvify();
        p1.isTeamBuilding();
        System.out.println("Rate of bonus for " + p1.getName() + " is: " + p1.bonusRateTotal());

    }
}
