class SoundAnimal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class SoundDog extends SoundAnimal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class SoundCat extends SoundAnimal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

public class AnimalSoundOverriding {
    public static void main(String[] args) {
        SoundAnimal animal1 = new SoundDog();
        SoundAnimal animal2 = new SoundCat();

        animal1.makeSound();
        animal2.makeSound();
    }
}
