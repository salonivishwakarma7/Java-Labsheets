import java.util.Scanner;

public class StringLexicographicOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int i = 0;
        int len = Math.min(s1.length(), s2.length());

        while (i < len && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        if (i == len) {
            if (s1.length() == s2.length()) {
                System.out.println("Both strings are equal");
            } else if (s1.length() < s2.length()) {
                System.out.println("First string comes before second");
            } else {
                System.out.println("First string comes after second");
            }
        } else if (s1.charAt(i) < s2.charAt(i)) {
            System.out.println("First string comes before second");
        } else {
            System.out.println("First string comes after second");
        }

        sc.close();
    }
}