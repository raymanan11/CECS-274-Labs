package labs;
import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a word: " );
        String wd = sc.nextLine();
        int middleNumber = wd.length() / 2;

        if (wd.length() % 2 == 1) {
            char middleCharacter = wd.charAt(middleNumber);
            System.out.println("Middle: " + middleCharacter);
        }

        else if (wd.length() % 2 == 0){
            String middleCharacters = wd.substring(middleNumber - 1, middleNumber + 1);
            System.out.println("Middle: " + middleCharacters);
        }

    }
}
