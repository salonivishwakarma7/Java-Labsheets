class TransportVehicle {
    void start() {
        System.out.println("Vehicle has started.");
    }

    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

class FamilyCar extends TransportVehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

class BatteryCar extends FamilyCar {
    void chargeBattery() {
        System.out.println("Electric car battery is charging.");
    }
}

public class ElectricCar {
    public static void main(String[] args) {
        BatteryCar car = new BatteryCar();

        car.start();
        car.drive();
        car.chargeBattery();
        car.stop();
    }
}
