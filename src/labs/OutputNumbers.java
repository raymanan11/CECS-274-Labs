package labs;
import java.util.Scanner;

public class OutputNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        // Add more variables as needed

        numElements = scnr.nextInt();   // Input begins with number of integers that follow

        for (int i = 0; i < numElements; i++) {
            int userNumber = scnr.nextInt();
            userList[numElements - i - 1] = userNumber;
        }

        for (int element : userList) {
            if (element != 0) {
                System.out.print(element + " ");
                System.out.println(" ");
            }
        }
        System.out.println("");
    }
}