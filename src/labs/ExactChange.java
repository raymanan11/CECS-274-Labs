package labs;
import java.util.Scanner;

public class ExactChange {

    public static void exactChange(int userTotal, int[] coinVals) {

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

        String[] coinNamesPlural = {"dollars", "quarters", "dimes", "nickels", "pennies"};
        String[] coinNamesSingular = {"dollar", "quarter", "dime", "nickel", "penny"};

        if (userTotal <= 0) {
            System.out.println("no change");
        }

        else if (userTotal > 0) {
            numberofDollars = userTotal / DOLLARVALUE;
            leftover = userTotal % DOLLARVALUE;
            numberOfQuarters = leftover / QUARTERVALUE;
            leftover = leftover % QUARTERVALUE;
            numberofDimes = leftover / DIMEVALUE;
            leftover = leftover % DIMEVALUE;
            numberOfNickels = leftover / NICKELVALUE;
            leftover = leftover % NICKELVALUE;
            numberOfPennies = leftover / PENNYVALUE;

            coinVals[0] = numberofDollars;
            coinVals[1] = numberOfQuarters;
            coinVals[2] = numberofDimes;
            coinVals[3] = numberOfNickels;
            coinVals[4] = numberOfPennies;
            // added values into the integer array

            for (int i = 0; i < coinVals.length; i++) {
                if(coinVals[i] > 0 && coinVals[i] == 1) {
                    System.out.println(coinVals[i] + " " + coinNamesSingular[i]);
                }
                else if (coinVals[i] > 0 && coinVals[i] >= 2) {
                    System.out.println(coinVals[i] + " " + coinNamesPlural[i]);
                }
            }
            // if number of coins in each index is greater than 0 and = to 1, then print out the # of coins and it's singular name
            // if number of coins in each index is greater than 0 and >= 2, then print out the # of coins and the plural name of coin

        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userTotal = scnr.nextInt();
        int[] numberOfCoins = new int[5];
        exactChange(userTotal, numberOfCoins);
    }
}
