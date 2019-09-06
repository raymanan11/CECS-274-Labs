package labs;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        }
        else if (b > a && b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
