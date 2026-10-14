public class PrimeChecker {
    static int totalPrimeChecks = 0;

    void checkPrime(int number) {
        totalPrimeChecks++;

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / i; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        int number = 17;

        PrimeChecker checker = new PrimeChecker();
        checker.checkPrime(number);

        System.out.println("Total Prime Checks: " + totalPrimeChecks);
    }
}
