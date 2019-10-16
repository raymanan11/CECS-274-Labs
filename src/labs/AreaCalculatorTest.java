package labs;
import java.util.Scanner;

public class AreaCalculatorTest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the length:");
        int userLength = scnr.nextInt();
        System.out.println("Enter the height:");
        int userHeight = scnr.nextInt();

        AreaCalculator calcArea = new AreaCalculator();
        try {
            int area = calcArea.calculateRectangle(userLength, userHeight);
            System.out.println(area);
        }
        catch (Exception error){
            System.out.println("Error is " + error);
        }
    }


}
