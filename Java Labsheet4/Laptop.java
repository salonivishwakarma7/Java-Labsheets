public class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    Laptop(String laptopBrand, int laptopRAM) {
        brand = laptopBrand;
        RAM = laptopRAM;
    }

    void displayDetails() {
        String laptopBrand = brand;
        int laptopRAM = RAM;

        System.out.println("Laptop Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("Operating System: " + os);
    }

    public static void main(String[] args) {
        String brand = "HP";
        int RAM = 16;

        Laptop laptop = new Laptop(brand, RAM);
        laptop.displayDetails();
    }
}
