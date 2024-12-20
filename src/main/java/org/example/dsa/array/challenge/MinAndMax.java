package org.example.dsa.array.challenge;

// Find the max and the min element in the array
public class MinAndMax {

    public static int setMini(int[] arr, int num) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < num; i++) {
            if (arr[i] < mini)
                mini = arr[i];
        }
        return mini;
    }

    public static int setMax(int[] arr, int num) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 6, 5, 2, 3};
        int num = arr.length;
        System.out.println("Minimum element is: " + setMini(arr, num));
        System.out.println("Maximum element is: " + setMax(arr, num));
    }
}
