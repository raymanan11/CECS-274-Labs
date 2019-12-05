package labs;
import java.util.Scanner;

public class RecursiveAddition {
    public int numSquared(int userInt) {
        if (userInt == 0) {
            return 0;
        }
        else {
            return numSquared(userInt - 1) + userInt + userInt - 1;
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a num you want to be squared: ");
        int userNum = scnr.nextInt();
        RecursiveAddition squared = new RecursiveAddition();
        System.out.println(squared.numSquared(userNum));
    }
}
