import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        if (num < 0) {
            System.out.println("Not a palindrome");
        } else {
            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if ((int) original == (int) reverse) {
                System.out.println("Palindrome number");
            } else {
                System.out.println("Not a palindrome");
            }
        }

        sc.close();
    }
}
