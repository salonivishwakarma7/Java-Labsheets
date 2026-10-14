public class Palindrome {
    static int countChecks = 0;

    void checkPalindrome(int number) {
        countChecks++;

        int originalNumber = number;
        int reverse = 0;
        int digit;

        if (number < 0) {
            System.out.println(number + " is not a palindrome.");
            return;
        }

        while (number > 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        int number = 121;

        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome(number);

        System.out.println("Total Checks: " + countChecks);
    }
}
