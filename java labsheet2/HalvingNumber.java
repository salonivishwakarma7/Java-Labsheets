import java.util.Scanner;

public class HalvingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double num = sc.nextDouble();
        int steps = 0;

        while (num >= 1) {
            num /= 2;
            steps++;
            System.out.println("Value: " + num);
        }

        System.out.println("Total steps = " + steps);

        sc.close();
    }
}