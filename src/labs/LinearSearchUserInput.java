package labs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearSearchUserInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userNum = new int[100];

        int index = 0;

        System.out.println("Enter up to 5 integers, followed by a non-number: ");
        while(scnr.hasNextInt()) {
            int userInput = scnr.nextInt();
            userNum[index] = userInput;
            index++;

            if(index >= 5) {
                System.out.println("Maximum number of elements (5) reached, discarded excess.");
                break;
            }
        }

        scnr.nextLine();

        System.out.println("Enter an integer to search for: ");
        try {
            int userKey = scnr.nextInt();
            int numKeysFound = 0;

            for (int i = 0; i < 5; i++) {
                if(userNum[i] == userKey) {
                    numKeysFound++;
                    System.out.println("Found at position: " + i);
                }
            }
            if (numKeysFound == 0) {
                System.out.println("Did not find the element.");
            }
        }

        catch (InputMismatchException error){
            System.out.println("Invalid entry, search stopped!");
        }
    }
}
