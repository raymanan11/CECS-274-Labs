package labs;
import java.util.Scanner;

public class MilesLaps {
    public static double milesToLaps(double userMiles) {
        final double quarterMile = 0.25;
        double numLaps = userMiles / quarterMile;
        return numLaps;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double miles = scnr.nextDouble();
        double numberOfLaps = milesToLaps(miles);
        System.out.printf("%.2f", numberOfLaps);
    }
}
