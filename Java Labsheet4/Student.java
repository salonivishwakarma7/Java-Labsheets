public class Student {
    String name;
    int age;
    static int count = 0;

    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
        count++;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        String name1 = "Rahul";
        int age1 = 20;

        String name2 = "Priya";
        int age2 = 19;

        Student s1 = new Student(name1, age1);
        Student s2 = new Student(name2, age2);

        s1.displayDetails();
        s2.displayDetails();

        System.out.println("Total Students: " + Student.count);
    }
}