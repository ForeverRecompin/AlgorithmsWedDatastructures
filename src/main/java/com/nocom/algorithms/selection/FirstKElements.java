package com.nocom.algorithms.selection;

import com.nocom.algorithms.sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fraj on 6/19/16 at 11:06 PM.
 */
public class FirstKElements {

    // TODO - Use a heap?
    // TODO - Documentation, Time Complexity.
    public static List<Integer> getFirstKSmallestElements(int[] numbers, int k) {
        List<Integer> firstKSmallestElements = new ArrayList<>();
        for (int kOrSmallerThanKNumber = k; kOrSmallerThanKNumber > 0; kOrSmallerThanKNumber--) {
            int numberToFind = kOrSmallerThanKNumber;
            int firstIndex = 0;
            int lastIndex = numbers.length - 1;
            innerloop:
            while (true) {
                int position = Sort.partitionViaQuickSortStrategy(numbers, firstIndex, lastIndex);
                int length = position - firstIndex + 1;
                if (numberToFind == length) {
                    firstKSmallestElements.add(numbers[position]);
                    break innerloop;
                } else if (numberToFind < length) {
                    lastIndex = position - 1;
                } else {
                    numberToFind = numberToFind - length;
                    firstIndex = position + 1;
                }
            }
        }
        return firstKSmallestElements;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1, 1, 2313123, 213, 123, 12, 313};
        System.out.println(Arrays.toString(numbers));
        List<Integer> firstKSmallestElements = getFirstKSmallestElements(numbers, 7);
        System.out.println(firstKSmallestElements);
    }
}
