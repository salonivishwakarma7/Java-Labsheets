public class Fibonacci {
    static int seriesCount = 0;

    void displaySeries(int n) {
        seriesCount++;

        if (n <= 0) {
            System.out.println("Enter a positive number of terms.");
            return;
        }

        long first = 0;
        long second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int terms = 10;

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.displaySeries(terms);

        System.out.println("Total Series Calls: " + seriesCount);
    }
}
