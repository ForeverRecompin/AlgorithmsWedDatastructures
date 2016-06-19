package com.nocom.algorithms.sort;

/**
 * Created by fraj on 6/19/16 at 11:45 PM.
 */
public class Sort {

    // TODO: Generics. Generics. Generics.

    public static void swap2Numbers(int[] numbers, int firstIndexToSwap, int secondIndexToSwap) {
        int firstIndexNumberPlaceholder = numbers[firstIndexToSwap];
        numbers[firstIndexToSwap] = numbers[secondIndexToSwap];
        numbers[secondIndexToSwap] = firstIndexNumberPlaceholder;
    }

    public static int partitionViaQuickSortStrategy(int[] numbers, int first, int last) {
        int pivotElementIndex = last;
        int firstHigh = first;
        for (int numbersIndex = first; numbersIndex < last; numbersIndex++) {
            if (numbers[numbersIndex] < numbers[pivotElementIndex]) {
                swap2Numbers(numbers, numbersIndex, firstHigh);
                firstHigh += 1;
            }
        }
        swap2Numbers(numbers, pivotElementIndex, firstHigh);
        return firstHigh;
    }

    public static void quickSort(int numbers[], int first, int last) {
        int partitionIndex;
        if (last - first > 0) {
            partitionIndex = partitionViaQuickSortStrategy(numbers, first, last);
            quickSort(numbers, 0, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, last);
        }
    }
}

