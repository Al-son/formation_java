package org.example.dsa.array.challenge;

import java.util.Arrays;

public class RotateArrayByOne {
    static int[] arr = new int[] {1, 2, 3, 4, 5};

    static void rotate() {
        int last_el = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = last_el;
    }

    public static void main(String[] args) {
        System.out.println("Given array is");
        System.out.println(Arrays.toString(arr));
        rotate();
        System.out.println("Rotated array is");
        System.out.println(Arrays.toString(arr));
    }
}