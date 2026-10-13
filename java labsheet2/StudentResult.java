import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory marks (%): ");
        double theory = sc.nextDouble();

        System.out.print("Enter practical marks (%): ");
        double practical = sc.nextDouble();

        double overall = (theory + practical) / 2;

        if ((theory >= 40 && practical >= 50) ||
             overall >= 50) {
            System.out.println("Student passes");
        } else {
            System.out.println("Student fails");
        }

        System.out.println("Overall percentage = " + overall);

        sc.close();
    }
}