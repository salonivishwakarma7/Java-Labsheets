import java.util.Scanner;

public class SmallestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int min1 = (a < b) ? a : b;
        int min2 = (c < d) ? c : d;
        int smallest = (min1 < min2) ? min1 : min2;

        System.out.println("Smallest number = " + smallest);

        sc.close();
    }
}
