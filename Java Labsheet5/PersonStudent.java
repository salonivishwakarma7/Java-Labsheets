class PersonDetails {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class CollegeStudent extends PersonDetails {
    int rollNo;
    String course;

    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class PersonStudent{
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent();

        student.name = "Saloni";
        student.age = 20;
        student.rollNo = 101;
        student.course = "BCA AI and ML";

        student.displayStudent();
    }
}