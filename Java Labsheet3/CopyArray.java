import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] original = new int[n];
        int[] copy = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied array:");

        for (int value : copy) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
