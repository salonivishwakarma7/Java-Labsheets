import java.util.Scanner;

public class tax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();
        double tax;

        if (salary < 0) {
            System.out.println("Invalid salary");
        } else if (salary <= 250000) {
            tax = 0;
            System.out.println("Tax: Rs. " + tax);
        } else if (salary <= 500000) {
            tax = salary * 0.05;
            System.out.println("Tax: Rs. " + tax);
        } else if (salary <= 1000000) {
            tax = salary * 0.20;
            System.out.println("Tax: Rs. " + tax);
        } else {
            tax = salary * 0.30;
            System.out.println("Tax: Rs. " + tax);
        }

        sc.close();
    }
}