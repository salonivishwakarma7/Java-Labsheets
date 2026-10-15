class HumanProfile {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class UniversityStudent extends HumanProfile {
    String course;

    void study() {
        System.out.println(name + " is studying " + course + ".");
    }
}

class SubjectTeacher extends HumanProfile {
    String subject;

    void teach() {
        System.out.println(name + " teaches " + subject + ".");
    }
}

public class PersonStudentTeacher {
    public static void main(String[] args) {
        UniversityStudent student = new UniversityStudent();
        student.name = "Riya";
        student.course = "BCA";

        SubjectTeacher teacher = new SubjectTeacher();
        teacher.name = "Mr. Sharma";
        teacher.subject = "Java";

        System.out.println("Student Details:");
        student.displayName();
        student.study();

        System.out.println("\nTeacher Details:");
        teacher.displayName();
        teacher.teach();
    }
}
