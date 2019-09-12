package labs;
import java.util.Scanner;

public class NoCommaSpacePeriod {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userText;

        userText = scnr.nextLine();

        int nonLetterCount = 0;
        for (int i = 0; i < userText.length(); i++) {
            if (!Character.isLetter(userText.charAt(i)) && userText.charAt(i) != '!') {
                nonLetterCount++;
            }
        }
        int numLetter = userText.length() - nonLetterCount;
        System.out.println(numLetter);
    }
}
