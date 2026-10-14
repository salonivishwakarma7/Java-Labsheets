public class Car {
    String brand;
    double mileage;
    static int wheels = 4;

    Car(String carBrand, double carMileage) {
        brand = carBrand;
        mileage = carMileage;
    }

    void displayDetails() {
        String carBrand = brand;
        double carMileage = mileage;

        System.out.println("Car Brand: " + carBrand);
        System.out.println("Mileage: " + carMileage + " km/l");
        System.out.println("Number of Wheels: " + wheels);
    }

    public static void main(String[] args) {
        String brand = "Hyundai";
        double mileage = 18.5;

        Car car = new Car(brand, mileage);
        car.displayDetails();
    }
}
