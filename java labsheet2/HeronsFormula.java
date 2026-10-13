import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Area = " + area);
        } else {
            System.out.println("Invalid triangle");
        }

        sc.close();
    }
}