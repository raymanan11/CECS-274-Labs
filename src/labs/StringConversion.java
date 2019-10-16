package labs;
import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        do {
            System.out.println("Enter a double number, or q to quit:");
            String doubleStringValue = scnr.nextLine();

            if (!doubleStringValue.equals("q")) {
                try {
                    double doubleValue = Double.parseDouble(doubleStringValue);
                    System.out.println("The double value representation is: " + doubleValue);
                }
                catch (NumberFormatException e) {
                    System.out.println("That was not a valid double number!");
                }
            }
            else {
                break;
            }
        }
        while(true);
    }
}
