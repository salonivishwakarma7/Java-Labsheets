import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;

            System.out.println("Factors of " + num + ":");

            do {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= num);
        }

        sc.close();
    }
}
