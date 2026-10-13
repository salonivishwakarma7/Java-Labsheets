import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter annual rate (%): ");
        double r = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double t = sc.nextDouble();

        System.out.print("Enter compounds per year: ");
        int n = sc.nextInt();

        double amount = p * Math.pow(1 + r / (100 * n), n * t);
        double ci = amount - p;

        System.out.printf("Amount = %.2f%n", amount);
        System.out.printf("Compound Interest = %.2f%n", ci);

        sc.close();
    }
}
