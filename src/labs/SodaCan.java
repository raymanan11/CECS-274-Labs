package labs;
import java.util.Scanner;

public class SodaCan {
    public int height;
    public int radius;

    public int setHeight(int userHeight) {
        height = userHeight;
        return height;
    }

    public int setRadius(int userRadius) {
        radius = userRadius;
        return radius;
    }

    public double getSurfaceArea() {
        double surfaceArea = 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        return surfaceArea;
    }

    public double getVolume() {
        double surfaceArea = Math.PI * radius * radius * height;
        return surfaceArea;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SodaCan sodaCan = new SodaCan();

        int userHeight = scnr.nextInt();
        int userRadius = scnr.nextInt();

        sodaCan.setHeight(userHeight);
        sodaCan.setRadius(userRadius);

        System.out.println(sodaCan.getSurfaceArea());
        System.out.println(sodaCan.getVolume());

    }

}
