public class StringReverse {
    static int totalReversals = 0;

    void reverseString(String text) {
        totalReversals++;

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + reversed);
    }

    public static void main(String[] args) {
        String input = "Java Programming";

        StringReverse reverse = new StringReverse();
        reverse.reverseString(input);

        System.out.println("Total Reversals: " + totalReversals);
    }
}
