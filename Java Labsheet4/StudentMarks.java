public class StudentMarks {
    double marks1, marks2, marks3;
    static String universityName = "COER University";

    StudentMarks(double m1, double m2, double m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void calculateAverage() {
        double total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("University: " + universityName);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        double m1 = 80;
        double m2 = 75;
        double m3 = 90;

        StudentMarks student = new StudentMarks(m1, m2, m3);
        student.calculateAverage();
    }
}
