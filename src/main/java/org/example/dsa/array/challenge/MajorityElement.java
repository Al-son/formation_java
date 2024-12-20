package org.example.dsa.array.challenge;

public class MajorityElement {
    static int majorityElement(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++){
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > size / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(arr));
    }
}
