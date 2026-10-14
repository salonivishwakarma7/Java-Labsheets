public class Person {
    String name;
    int age;
    static String country = "India";

    Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    void checkEligibility() {
        int votingAge = 18;
        boolean eligible = age >= votingAge;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);

        if (eligible) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        String name = "Aman";
        int age = 20;

        Person person = new Person(name, age);
        person.checkEligibility();
    }
}
