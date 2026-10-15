class CommonAnimal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class BarkingDog extends CommonAnimal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class MeowingCat extends CommonAnimal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        BarkingDog dog = new BarkingDog();
        MeowingCat cat = new MeowingCat();

        System.out.println("Dog Details:");
        dog.eat();
        dog.bark();

        System.out.println("\nCat Details:");
        cat.eat();
        cat.meow();
    }
}
