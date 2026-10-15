class LivingAnimal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class DomesticDog extends LivingAnimal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class LittlePuppy extends DomesticDog {
    void play() {
        System.out.println("Puppy is playing.");
    }
}

public class PuppyInheritance {
    public static void main(String[] args) {
        LittlePuppy puppy = new LittlePuppy();

        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}
