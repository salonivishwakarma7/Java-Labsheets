import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter logical operator (&, |): ");
        char op = sc.next().charAt(0);

        boolean result;

        if (op == '&') {
            result = (a != 0 && b != 0);
            System.out.println("Result: " + result);
        } else if (op == '|') {
            result = (a != 0 || b != 0);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid logical operator");
        }

        sc.close();
    }
}
