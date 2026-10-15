class StaffMember {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class SoftwareDeveloper extends StaffMember {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Writing code in " + programmingLanguage + ".");
    }
}

class TeamManager extends StaffMember {
    String department;

    void conductMeeting() {
        System.out.println("Conducting a meeting for " + department + ".");
    }
}

public class EmployeeRoleHierarchy {
    public static void main(String[] args) {
        SoftwareDeveloper developer = new SoftwareDeveloper();
        developer.employeeName = "Aman";
        developer.employeeId = 101;
        developer.programmingLanguage = "Java";

        TeamManager manager = new TeamManager();
        manager.employeeName = "Neha";
        manager.employeeId = 102;
        manager.department = "Development";

        System.out.println("Developer Details:");
        developer.displayEmployee();
        developer.writeCode();

        System.out.println("\nManager Details:");
        manager.displayEmployee();
        manager.conductMeeting();
    }
}
