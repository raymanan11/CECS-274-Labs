package labs;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char userChar = scnr.next().charAt(0);
        String userString = scnr.nextLine();

        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == userChar){
                count++;
            }
        }
        System.out.println(count);
    }
}
