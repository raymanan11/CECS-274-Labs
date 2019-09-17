package labs;
import java.util.Scanner;

public class DrivingCost {
    public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
        double gallonsUsed = drivenMiles / milesPerGallon;
        double costOfDriving = gallonsUsed * dollarsPerGallon;
        return costOfDriving;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userMilesPerGallon = scnr.nextDouble();
        double dollarsPerGallon = scnr.nextDouble();

        double drivingCost10Miles = drivingCost(10.00, userMilesPerGallon, dollarsPerGallon);
        double drivingCost50Miles = drivingCost(50.00, userMilesPerGallon, dollarsPerGallon);
        double drivingCost400Miles = drivingCost(400.00, userMilesPerGallon, dollarsPerGallon);


        System.out.printf("%.2f %.2f %.2f\n", drivingCost10Miles, drivingCost50Miles, drivingCost400Miles);
    }
}
