public class ElectricBill {
    double units;
    static double fixedCharge = 100.0;

    ElectricBill(double units) {
        this.units = units;
    }

    void calculateBill() {
        double energyCharge;

        if (units < 0) {
            System.out.println("Invalid number of units.");
            return;
        } else if (units <= 100) {
            energyCharge = units * 3.0;
        } else if (units <= 200) {
            energyCharge = 100 * 3.0 + (units - 100) * 5.0;
        } else {
            energyCharge = 100 * 3.0 + 100 * 5.0
                    + (units - 200) * 7.0;
        }

        double totalBill = energyCharge + fixedCharge;

        System.out.println("Units Consumed: " + units);
        System.out.println("Energy Charge: Rs. " + energyCharge);
        System.out.println("Fixed Charge: Rs. " + fixedCharge);
        System.out.println("Total Electricity Bill: Rs. " + totalBill);
    }

    public static void main(String[] args) {
        double units = 150;

        ElectricBill bill = new ElectricBill(units);
        bill.calculateBill();
    }
}
