import java.util.Scanner;

public class ShiftMultiplicationDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter shift positions: ");
        int n = sc.nextInt();

        System.out.println("Multiplication by 2^" + n + " = " + (num << n));
        System.out.println("Division by 2^" + n + " = " + (num >> n));

        sc.close();
    }
}
