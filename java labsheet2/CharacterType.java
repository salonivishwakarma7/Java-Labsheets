import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = !Character.isLetterOrDigit(ch)
                ? "Special symbol"
                : !Character.isLetter(ch)
                ? "Digit"
                : ("aeiouAEIOU".indexOf(ch) >= 0)
                ? "Vowel"
                : "Consonant";

        System.out.println("Character type = " + result);

        sc.close();
    }
}
