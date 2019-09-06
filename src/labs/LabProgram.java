package labs;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.

        caffeineMg = scnr.nextDouble();
        double caffeineMgSixHours = caffeineMg / 2;
        double caffeineMgTwelveHours = caffeineMgSixHours / 2;
        double caffeineMgEighteenHours = caffeineMgTwelveHours / 2;


        System.out.printf("After 6 hours: %.2f mg\n", caffeineMgSixHours);
        System.out.printf("After 12 hours: %.2f mg\n", caffeineMgTwelveHours);
        System.out.printf("After 18 hours: %.2f mg\n", caffeineMgEighteenHours);
    }
}
