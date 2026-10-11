import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == num) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not an Armstrong number");
            }
        } else {
            System.out.println("Please enter a 3-digit positive number.");
        }

        sc.close();
    }
}
