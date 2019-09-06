package labs;
import java.util.Scanner;

public class CountingHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence; // use .nextLine() for the input string
        int count;

        sentence = sc.nextLine();
        String lowerCaseSentence = sentence.toLowerCase();

        count = 0;
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (lowerCaseSentence.charAt(i) == 'h' && lowerCaseSentence.charAt(i + 1) == 'i') {
                count += 1;
            }
        }
        System.out.println(count + " time(s).");

    }
}
