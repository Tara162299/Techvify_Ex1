package FirstDay.Ex4_Collection;

public class People implements Comparable<People> {
    private String name;
    private String company;
    private int yearOfExp;
    private double rating;

    @Override
    public int compareTo(People people) {
        //return name.compareTo(people.getName());
        return yearOfExp - people.getYearOfExp();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public double getRating() {
        return rating;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString() {

        return ("Name: " + name + "| Company name: " + company + "| Years of EXP: " + yearOfExp + "| Rating: " + rating);
    }
}
