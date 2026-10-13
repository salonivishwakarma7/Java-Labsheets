import java.util.Scanner;

public class MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check whether the number is a power of 4
        int temp = num;

        while (temp > 1 && temp % 4 == 0) {
            temp = temp >> 2;
        }

        if (num > 0 && temp == 1) {
            System.out.println(num + " is a power of 4");
        } else {
            System.out.println(num + " is not a power of 4");
        }

        // Toggle the third bit (bit position 3, counting from 1)
        int toggled = num ^ (1 << 2);
        System.out.println("After toggling the third bit: " + toggled);

        // Print multiplication table
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {
            int result = num * i;

            if (result % 48 == 0) {
                System.out.println("Stopped at multiple of 48: " + result);
                break;
            }

            if (result % 6 == 0) {
                continue;
            }

            System.out.println(num + " x " + i + " = " + result);
        }

        sc.close();
    }
}
