package org.example.dsa.array.challenge;

import java.util.Arrays;

public class SortArray {

    static void sortArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped =true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
