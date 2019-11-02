package labs;
import java.util.Scanner;

public class SortArray {
    public static void sortArray(int[] myArr, int arrSize) {
        for (int firstUnsorted = 0; firstUnsorted < arrSize - 1; firstUnsorted++) {

            int smallestIndex = firstUnsorted;

            for (int i = firstUnsorted + 1; i < arrSize; i++) {
                if(myArr[i] < myArr[smallestIndex]) {
                    smallestIndex = i;
                }
            }

            int temp = myArr[smallestIndex];
            myArr[smallestIndex] = myArr[firstUnsorted];
            myArr[firstUnsorted] = temp;
        }

        for (int i = 0; i < arrSize; i ++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numInts = scnr.nextInt();
        int userInt;
        int[] intArr = new int[20];

        for (int i = 0; i < numInts; i++) {
            userInt = scnr.nextInt();
            intArr[i] = userInt;
        }

        sortArray(intArr, numInts);
    }
}
