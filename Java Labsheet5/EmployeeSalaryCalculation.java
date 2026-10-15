class SalaryEmployee {
    double calculateSalary() {
        return 30000;
    }
}

class SalaryManager extends SalaryEmployee {
    @Override
    double calculateSalary() {
        double basicSalary = 50000;
        double allowance = 10000;

        return basicSalary + allowance;
    }
}

public class EmployeeSalaryCalculation {
    public static void main(String[] args) {
        SalaryEmployee employee = new SalaryEmployee();
        SalaryManager manager = new SalaryManager();

        System.out.println("Employee Salary: " + employee.calculateSalary());
        System.out.println("Manager Salary: " + manager.calculateSalary());
    }
}
