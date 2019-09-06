package labs;
import java.util.Scanner;

public class DrawRightTriangle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char triangleChar;
        int triangleHeight;

        System.out.println("Enter a character:");
        triangleChar = scnr.next().charAt(0);

        System.out.println("Enter triangle height:");
        triangleHeight = scnr.nextInt();
        System.out.println("");

        for (int row = 0; row < triangleHeight; row++) {
            for (int column = 0; column < row + 1; column++) {
                System.out.print(triangleChar + " ");
            }
            System.out.println("");
        }
    }
}
