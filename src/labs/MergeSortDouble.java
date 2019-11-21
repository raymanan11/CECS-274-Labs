package labs;

public class MergeSortDouble {
    public static void sort(int[] numbers){
        mergeSort(numbers, 0, numbers.length - 1);
    }

    public static void mergeSort(int[] array, int i, int k) {
        if (i < k) {
            int middle = (i + k) / 2;
            mergeSort(array, i, middle);
            mergeSort(array, middle + 1, k);
            merge(array, i, middle, k);
        }
    }

    public static void merge(int[] numbers, int i, int middle, int k) {
        int mergedSize = k - i + 1;       // Size of merged partition
        int mergedNumbers[] = new int[mergedSize]; // Temporary array for merged numbers
        int mergePos;                     // Position to insert merged number
        int leftPos;                      // Position of elements in left partition
        int rightPos;                     // Position of elements in right partition

        mergePos = 0;
        leftPos = i;                      // Initialize left partition position
        rightPos = middle + 1;                 // Initialize right partition position

        // Add smallest element from left or right partition to merged numbers
        while (leftPos <= middle && rightPos <= k) {
            if (numbers[leftPos] < numbers[rightPos]) {
                mergedNumbers[mergePos] = numbers[leftPos];
                ++leftPos;
            }
            else {
                mergedNumbers[mergePos] = numbers[rightPos];
                ++rightPos;
            }
            ++mergePos;
        }

        // If left partition is not empty, add remaining elements to merged numbers
        while (leftPos <= middle) {
            mergedNumbers[mergePos] = numbers[leftPos];
            ++leftPos;
            ++mergePos;
        }

        // If right partition is not empty, add remaining elements to merged numbers
        while (rightPos <= k) {
            mergedNumbers[mergePos] = numbers[rightPos];
            ++rightPos;
            ++mergePos;
        }

        // Copy merge number back to numbers
        for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
            numbers[i + mergePos] = mergedNumbers[mergePos];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 11, 8, 4};
        sort(numbers);
        System.out.println();
        System.out.println("SORTED:");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
