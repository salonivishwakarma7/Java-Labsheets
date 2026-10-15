interface DocumentPrinter {
    void print();
}

interface DocumentScanner {
    void scan();
}

class OfficeMachine implements DocumentPrinter, DocumentScanner {
    private String machineName;
    private int machineId;

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public int getMachineId() {
        return machineId;
    }

    @Override
    public void print() {
        System.out.println("Machine is printing a document.");
    }

    @Override
    public void scan() {
        System.out.println("Machine is scanning a document.");
    }

    void displayMachineDetails() {
        System.out.println("Machine Name: " + getMachineName());
        System.out.println("Machine ID: " + getMachineId());
    }
}

public class MultiFunctionMachine {
    public static void main(String[] args) {
        OfficeMachine machine = new OfficeMachine();

        machine.setMachineName("HP Office Machine");
        machine.setMachineId(501);

        machine.displayMachineDetails();
        machine.print();
        machine.scan();
    }
}
