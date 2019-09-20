package labs;
import java.util.Arrays;
import java.util.Scanner;

public class Acronyms {
    public static String createAcronym(String userPhrase){
        String[] phrase = userPhrase.split(" ");
        String acronym = "";
        for (int i = 0; i < phrase.length; i++) {
            if (Character.isUpperCase(phrase[i].charAt(0))) {
                acronym += String.valueOf(phrase[i].charAt(0));
            }
        }
        return acronym;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userPhrase = scnr.nextLine();
        System.out.println(createAcronym(userPhrase));
    }
}
