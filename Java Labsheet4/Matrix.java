public class Matrix {
    int[][] matrix;
    static String matrixType = "2x2 Matrix";

    Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    void displayMatrix(int[][] result) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    void addMatrix(Matrix other) {
        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }

        System.out.println("Addition Result:");
        displayMatrix(sum);
    }

    void subtractMatrix(Matrix other) {
        int[][] difference = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                difference[i][j] = matrix[i][j] - other.matrix[i][j];
            }
        }

        System.out.println("Subtraction Result:");
        displayMatrix(difference);
    }

    public static void main(String[] args) {
        int[][] first = {
            {1, 2},
            {3, 4}
        };

        int[][] second = {
            {5, 6},
            {7, 8}
        };

        Matrix m1 = new Matrix(first);
        Matrix m2 = new Matrix(second);

        System.out.println("Matrix Type: " + matrixType);

        m1.addMatrix(m2);
        m1.subtractMatrix(m2);
    }
}
