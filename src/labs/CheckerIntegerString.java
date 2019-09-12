package labs;
import java.util.Scanner;

public class CheckerIntegerString {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        userString = scnr.next();

        int countNonDigit = 0;

        for (int i = 0; i < userString.length(); i++) {

            if (!Character.isDigit(userString.charAt(i))){
                countNonDigit++;
            }
        }

        if (countNonDigit > 0){
            System.out.println("no"); // if the number of nonDigits is greater than 0 then it means every character is not a digit
        }
        else {
            System.out.println("yes");
        }
    }
}
