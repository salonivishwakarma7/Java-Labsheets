public class Employee {
    int empId;
    double salary;
    static String companyName = "Tech Solutions";

    Employee(int id, double employeeSalary) {
        empId = id;
        salary = employeeSalary;
    }

    void displayDetails() {
        int id = empId;
        double employeeSalary = salary;

        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
        int employeeId = 101;
        double salary = 35000.0;

        Employee employee = new Employee(employeeId, salary);
        employee.displayDetails();
    }
}
