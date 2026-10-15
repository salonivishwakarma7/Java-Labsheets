class ResearchEmployee {
    private String name;
    private int employeeId;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    void displayEmployee() {
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
    }
}

interface CodeWriter {
    void writeCode();
}

interface ResearchWorker {
    void conductResearch();
}

class ResearchDeveloper extends ResearchEmployee
        implements CodeWriter, ResearchWorker {

    @Override
    public void writeCode() {
        System.out.println("Developer is writing code.");
    }

    @Override
    public void conductResearch() {
        System.out.println("Developer is conducting research.");
    }
}

public class DeveloperResearch {
    public static void main(String[] args) {
        ResearchDeveloper developer = new ResearchDeveloper();

        developer.setName("Karan");
        developer.setEmployeeId(701);

        developer.displayEmployee();
        developer.writeCode();
        developer.conductResearch();
    }
}
