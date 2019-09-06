package labs;
import java.sql.SQLOutput;
import java.util.Scanner;

public class OutputWithVars {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int userNum2;
        System.out.println("Enter integer:");
        userNum = scnr.nextInt();
        System.out.println(userNum);
        System.out.println("You entered: " + userNum);
        int userNumSquared = userNum * userNum;
        System.out.println(userNum + " squared is " + userNumSquared);
        int userNumCubed = userNum * userNum * userNum;
        System.out.println("And " + userNum + " cubed is " + userNumCubed + "!!");
        System.out.println("Enter another integer:");
        userNum2 = scnr.nextInt();
        int userNumAdded = userNum + userNum2;
        int userNumMultiplied = userNum * userNum2;
        System.out.println(userNum2);
        System.out.println(userNum + " + " + userNum2 + " is " + userNumAdded);
        System.out.println(userNum + " * " + userNum2 + " is " + userNumMultiplied);

    }
}
