package labs;
import java.lang.Math;
import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double x;
        double y;
        double z;

        x = scnr.nextDouble();
        y = scnr.nextDouble();
        z = scnr.nextDouble();

        double xPowery = Math.pow(x, y);
        double yPowerz = Math.pow(y, z);
        double xPowerYZ = Math.pow(x, yPowerz);
        double absX = Math.abs(x);
        double xyPowerz = Math.sqrt(Math.pow(x * y, z));

        System.out.println(xPowery + " " + xPowerYZ + " " + absX + " " + xyPowerz);
    }
}
