class BaseVehicle {
    void start() {
        System.out.println("Vehicle has started.");
    }
}

class RegularCar extends BaseVehicle {
    void drive() {
        System.out.println("Car is moving.");
    }
}

interface ElectricPower {
    void chargeBattery();
}

class HybridElectricCar extends RegularCar implements ElectricPower {
    @Override
    public void chargeBattery() {
        System.out.println("Battery is charging.");
    }
}

public class HybridVehicle {
    public static void main(String[] args) {
        HybridElectricCar car = new HybridElectricCar();

        car.start();
        car.drive();
        car.chargeBattery();
    }
}