package org.example.dsa.array.challenge;

public class ReverseArray {
    static void reverseArray1(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++)
            temp[i] = arr[n - i - 1];
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    static void reverseArray2(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void reverseArray3(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 6, 5};
        reverseArray3(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
