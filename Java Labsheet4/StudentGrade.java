public class StudentGrade {
    String name;
    double marks;
    static double passingMarks = 40;

    StudentGrade(String studentName, double studentMarks) {
        name = studentName;
        marks = studentMarks;
    }

    void assignGrade() {
        String grade;

        if (marks < 0 || marks > 100) {
            grade = "Invalid Marks";
        } else if (marks < passingMarks) {
            grade = "F";
        } else if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        String name = "Riya";
        double marks = 85;

        StudentGrade student = new StudentGrade(name, marks);
        student.assignGrade();
    }
}
