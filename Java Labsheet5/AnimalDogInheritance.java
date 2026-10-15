class AnimalBase {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class DogPet extends AnimalBase {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class AnimalDogInheritance {
    public static void main(String[] args) {
        DogPet dog = new DogPet();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
