package labs;
import java.util.Scanner;
import java.lang.Math;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is " + sum);

        int distance = Math.abs(a - b);
        System.out.println("The distance is " + distance);

        int product = a * b;
        System.out.println("The product is " + product);




    }
}
