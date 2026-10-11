import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        if (num > 1) {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
        }

        if (num > 1 && sum == num) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }

        sc.close();
    }
}