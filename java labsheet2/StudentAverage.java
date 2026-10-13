public class StudentAverage {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 75, 90},
            {70, 85, 65},
            {95, 88, 92}
        };

        int studentNo = 1;

        for (int[] student : marks) {
            int total = 0;

            for (int mark : student) {
                total += mark;
            }

            double average = (double) total / student.length;

            System.out.printf(
                "Average marks of student %d = %.2f%n",
                studentNo, average
            );

            studentNo++;
        }
    }
}
