package labs;
import java.util.Scanner;

public class StepCounter {
    public static double stepsToMiles(double userSteps) {
        final int milesInSteps= 2000;
        double miles = userSteps / milesInSteps;
        return miles;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userSteps = scnr.nextInt();
        double miles = stepsToMiles(userSteps);
        System.out.printf("%.2f",miles);
    }
}
