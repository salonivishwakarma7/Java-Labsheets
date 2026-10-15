class PersonIdentity {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class OfficeEmployee extends PersonIdentity {
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class SeniorManager extends OfficeEmployee {
    String department;

    void displayManager() {
        displayName();
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagerHierarchy {
    public static void main(String[] args) {
        SeniorManager manager = new SeniorManager();

        manager.name = "Priya";
        manager.employeeId = 501;
        manager.department = "Human Resources";

        manager.displayManager();
    }
}
