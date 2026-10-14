public class Armstrong {
    static int totalChecks = 0;

    void checkArmstrong(int number) {
        totalChecks++;

        int originalNumber = number;
        int temp = number;
        int digits = 0;
        int sum = 0;

        if (number < 0) {
            System.out.println(number + " is not an Armstrong number.");
            return;
        }

        do {
            digits++;
            temp = temp / 10;
        } while (temp > 0);

        temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        int number = 153;

        Armstrong armstrong = new Armstrong();
        armstrong.checkArmstrong(number);

        System.out.println("Total Checks: " + totalChecks);
    }
}
