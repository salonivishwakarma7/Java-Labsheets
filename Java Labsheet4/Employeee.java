public class Employeee {
    String name;
    double salary;
    static String organization = "ABC Technologies";

    Employeee(String employeeeName, double employeeeSalary) {
        name = employeeeName;
        salary = employeeeSalary;
    }

    void compareSalary(Employeee other) {
        double salary1 = this.salary;
        double salary2 = other.salary;

        System.out.println("Organization: " + organization);
        System.out.println(name + "'s Salary: Rs. " + salary1);
        System.out.println(other.name + "'s Salary: Rs. " + salary2);

        if (salary1 > salary2) {
            System.out.println(name + " has a higher salary.");
        } else if (salary1 < salary2) {
            System.out.println(other.name + " has a higher salary.");
        } else {
            System.out.println("Both employees have equal salaries.");
        }
    }

    public static void main(String[] args) {
        String name1 = "Amit";
        double salary1 = 40000;

        String name2 = "Neha";
        double salary2 = 45000;

        Employeee e1 = new Employeee(name1, salary1);
        Employeee e2 = new Employeee(name2, salary2);

        e1.compareSalary(e2);
    }
}
