package labs;

import java.util.Arrays;

public class BubbleSortString {
    public void bubbleSort(String[] stringVals) {

        for (int sorted = 0; sorted < stringVals.length - 1; sorted++) {
            for (int i = 0; i < stringVals.length - sorted - 1; i++) {
                String firstString = stringVals[i].toLowerCase();
                String nextString = stringVals[i+1].toLowerCase();
                if (firstString.compareTo(nextString) > 0) {
                    String temp = stringVals[i];
                    stringVals[i] = stringVals[i+1];
                    stringVals[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(stringVals));

    }

    public static void main(String[] args) {
        //"3", "7", "A", "M", "V", "X", "a", "c", "r"

        String[] strings = {"roar", "Lion", "1999", "CECS274", "example"};
        BubbleSortString plzBubbleSort = new BubbleSortString();

        System.out.println(Arrays.toString(strings));

        plzBubbleSort.bubbleSort(strings);

    }
}
