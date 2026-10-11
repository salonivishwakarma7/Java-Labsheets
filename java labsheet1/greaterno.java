import java.util.Scanner;

public class greaterno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is the greatest number.");
        } else if (b > a) {
            System.out.println(b + " is the greatest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}
