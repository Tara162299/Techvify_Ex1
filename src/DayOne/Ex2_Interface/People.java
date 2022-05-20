package DayOne.Ex2_Interface;

import static java.lang.System.out;

public class People implements Characteristics {
    private String name;
    private String company;

    private int year;
    private boolean statement = false;

    public People(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public People() {
    }

    @Override
    public void isTechvify() {
        if (!company.equals("Techvify")) {
            out.println(name + " does not work for Techvify");
        } else {
            out.println(name + " does work for Techvify");
            statement = true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void yearOfExp(int year) {
        this.year = year;
    }

    @Override
    public void isTeamBuilding() {
        if (statement && year > 1) {
            out.println(name + " has been with Techvify at least a team-building event");
        } else if (statement && year < 1) {
            out.println(name + " has been with Techvify but not on a team-building event");
        } else {
            out.println(name + " does work for Techvify to be in a team-building event");
        }
    }

    @Override
    public double bonusRateTotal() {
        if (statement) {
            return bonusRate * year;
        }
        else {
            return 0;
        }
    }
}
