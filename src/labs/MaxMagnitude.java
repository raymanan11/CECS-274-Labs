package labs;
import java.util.Scanner;

public class MaxMagnitude {
    public static int maxMagnitude(int userVal1, int userVal2) {
        if (userVal1 > userVal2 && userVal1 > 0 &&  userVal2 > 0) {
            return userVal1;
        }
        else if (userVal1 < userVal2 && userVal1 > 0 &&  userVal2 > 0) {
            return userVal2;
        }

        else if (userVal1 < 0 && userVal2 < 0 && Math.abs(userVal1) > Math.abs(userVal2)) {
            return userVal1;
        }

        else {
            return userVal2;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int firstUserValue = scnr.nextInt();
        int secondUserValue = scnr.nextInt();

        System.out.println(maxMagnitude(firstUserValue, secondUserValue));
    }
}
