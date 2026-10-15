class EmployeeInfo {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class DepartmentManager extends EmployeeInfo {
    String department;

    void displayManager() {
        System.out.println("Manager Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}

public class ManagerEncapsulation {
    public static void main(String[] args) {
        DepartmentManager manager = new DepartmentManager();

        manager.setName("Amit");
        manager.setSalary(75000);
        manager.department = "IT";

        manager.displayManager();
    }
}