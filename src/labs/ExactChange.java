package labs;
import java.util.Scanner;

public class ExactChange {

    public static void exactChange(int userTotal, int[] coinVals) {
        int[] coinvals = new int[5];

        final int DOLLARVALUE = 100;
        final int QUARTERVALUE = 25;
        final int DIMEVALUE = 10;
        final int NICKELVALUE = 5;
        final int PENNYVALUE = 1;

        int leftover;
        int numberofDollars;
        int numberOfQuarters;
        int numberofDimes;
        int numberOfNickels;
        int numberOfPennies;

        if (userTotal > 0) {
            numberofDollars = userTotal / DOLLARVALUE;
            leftover = userTotal % DOLLARVALUE;
            numberOfQuarters = leftover / QUARTERVALUE;
            leftover = leftover % QUARTERVALUE;
            numberofDimes = leftover / DIMEVALUE;
            leftover = leftover % DIMEVALUE;
            numberOfNickels = leftover / NICKELVALUE;
            leftover = leftover % NICKELVALUE;
            numberOfPennies = leftover / PENNYVALUE;

            coinvals[0] = numberofDollars;
            coinvals[1] = numberOfQuarters;
            coinvals[2] = numberofDimes;
            coinvals[3] = numberOfNickels;
            coinvals[4] = numberOfPennies;

            for (int i = 0; i < coinVals.length; i++) {
                System.out.println(coinVals[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userTotal = scnr.nextInt();
        int[] numberOfCoins = {5, 23, 34, 67, 24};
        exactChange(userTotal, numberOfCoins);
    }
}
