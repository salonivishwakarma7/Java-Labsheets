interface Researcher {
    void conductResearch();
}

class UniversityEmployee {
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
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Salary: " + getSalary());
    }

    public double calculateSalary() {
        return getSalary();
    }
}

class UniversityTeacher extends UniversityEmployee implements Researcher {
    String subject;

    void teach() {
        System.out.println("Teaching Subject: " + subject);
    }

    @Override
    public void conductResearch() {
        System.out.println("Teacher is conducting research.");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 5000;
    }
}

class VisitingFaculty extends UniversityTeacher {
    int hoursWorked;

    @Override
    public double calculateSalary() {
        return hoursWorked * 1000;
    }

    void displayVisitingDetails() {
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class UniversityAdmin extends UniversityEmployee {
    String department;

    void manageDepartment() {
        System.out.println("Managing Department: " + department);
    }
}

public class UniversityEmployeeSystem {
    public static void main(String[] args) {
        UniversityTeacher teacher = new UniversityTeacher();

        teacher.setEmployeeId(101);
        teacher.setEmployeeName("Mr. Sharma");
        teacher.setSalary(40000);
        teacher.subject = "Java Programming";

        System.out.println("=== Teacher Details ===");
        teacher.displayDetails();
        teacher.teach();
        teacher.conductResearch();
        System.out.println("Teacher Salary: " + teacher.calculateSalary());

        VisitingFaculty visiting = new VisitingFaculty();

        visiting.setEmployeeId(102);
        visiting.setEmployeeName("Ms. Priya");
        visiting.setSalary(0);
        visiting.subject = "Python";
        visiting.hoursWorked = 20;

        System.out.println("\n=== Visiting Teacher Details ===");
        visiting.displayDetails();
        visiting.teach();
        visiting.displayVisitingDetails();

        UniversityAdmin admin = new UniversityAdmin();

        admin.setEmployeeId(103);
        admin.setEmployeeName("Mr. Amit");
        admin.setSalary(35000);
        admin.department = "Administration";

        System.out.println("\n=== Admin Details ===");
        admin.displayDetails();
        admin.manageDepartment();
        System.out.println("Admin Salary: " + admin.calculateSalary());
    }
}
