package labs;
import java.util.Scanner;

public class AvgandMax {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        int currValue = scr.nextInt();
        int valuesSum = 0;
        int numOfDigits = 0;
        int max = 0;

        while(currValue >= 0) {
            valuesSum += currValue;
            numOfDigits++;
            if (currValue > max) {
                max = currValue;
            }
            currValue = scr.nextInt();
        }

        int avg = valuesSum / numOfDigits;
        System.out.println(avg + " " + max);
    }
}
