class EmployeeRecord {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        if (salary < 0 || salary > 1000000) {
            System.out.println("Invalid salary.");
        } else {
            this.salary = salary;
            System.out.println("Salary updated successfully.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Salary: " + getSalary());
    }
}

public class EmployeeSalaryValidation {
    public static void main(String[] args) {
        EmployeeRecord employee = new EmployeeRecord();

        employee.setEmployeeId(201);
        employee.setEmployeeName("Rahul");

        employee.setSalary(50000);
        employee.setSalary(-5000);
        employee.setSalary(1500000);

        employee.displayEmployee();
    }
}