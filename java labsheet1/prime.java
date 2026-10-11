import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= num / i; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
