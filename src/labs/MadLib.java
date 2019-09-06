package labs;
import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String userString = scr.next();
        System.out.println("Enter a number: ");
        int userNum = scr.nextInt();

        while (userNum != 0 && !userString.equals("quit")) {
            System.out.println("Eating " + userNum + " " + userString + " a day keeps the doctor away.");
            userString = scr.next();
            userNum = scr.nextInt();
        }
        scr.close();

    }
}
