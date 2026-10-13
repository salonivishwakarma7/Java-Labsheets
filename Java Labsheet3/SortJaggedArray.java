import java.util.Arrays;

public class SortJaggedArray {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 2, 8},
            {9, 1},
            {7, 4, 6, 3}
        };

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

        System.out.println("Sorted jagged array:");

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
