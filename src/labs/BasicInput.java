package labs;
import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt;
        double userDouble;
        char userCharacter;
        String userString;

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();

        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        userCharacter = scnr.next().charAt(0);

        System.out.println("Enter string:");
        userString = scnr.next();

        System.out.println(userInt + " " + userDouble + " " + userCharacter + " " + userString);
        System.out.println(userString + " " + userCharacter + " " + userDouble + " " + userInt);

        int cast = (int) userDouble;
        System.out.println(userDouble + " cast to an integer is " + cast);
        // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // FIXME (2): Output the four values in reverse

        // FIXME (3): Cast the double to an integer, and output that integer
    }
}
