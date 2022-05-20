package DayOne.Ex1_OverrideEquals;

public class Runner {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tara", 500);
        Employee e2 = new Employee();
        e2.setName("Martin");
        e2.setSalary(900);
        equals(e1, e2);
    }

    public static void equals(Employee e1, Employee e2) {
        if (e1.getSalary() >= e2.getSalary()) {
            System.out.println("Employee " + e1.getName() + " higher salary than employee " + e2.getName() +
                    ", by the amount of: " + compareSalary(e1.getSalary(), e2.getSalary()));
        }
        else {
            System.out.println("Employee " + e2.getName() + " higher salary than employee " + e1.getName() +
                    ", by the amount of: " + compareSalary(e1.getSalary(), e2.getSalary()));
        }
    }
    public static int compareSalary(int a, int b) {
        if (a >= b) {
            return a - b;
        }
        else {
            return b - a;
        }
    }
}
