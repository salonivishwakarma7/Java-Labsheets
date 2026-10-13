public class JaggedArrayDisplay {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };

        System.out.println("Jagged Array:");

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
