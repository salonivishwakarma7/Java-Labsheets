import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int mainSum = 0, secondarySum = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

                if (i == j) {
                    mainSum += matrix[i][j];
                }

                if (i + j == n - 1) {
                    secondarySum += matrix[i][j];
                }
            }
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secondarySum);

        sc.close();
    }
}