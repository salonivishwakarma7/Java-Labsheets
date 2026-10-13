import java.util.Scanner;

public class ThreeDArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];

        System.out.println("Enter 8 integers:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] == key) {
                        System.out.println(
                            "Found at layer " + (i + 1) +
                            ", row " + (j + 1) +
                            ", column " + (k + 1)
                        );
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
