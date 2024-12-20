package org.example.dsa.array.challenge;

public class MaximumNumberOf1S {
    static int R = 4, C = 4;

    static int first(int arr[], int low, int high) {
        int idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1){
                idx = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return idx;
    }

    static int rowWithMaxls(int[][] mat) {
        int max_tow_index = 0, max = -1;
        int i, index;
        for (i = 0; i < R; i++) {
            index = first(mat[i], 0, C - 1);
            if (index != -1 && C - index > max) {
                max = C - index;
                max_tow_index = i;
            }
        }
        return max_tow_index;
    }

    public static void main(String[] args) {
        int mat[][] = {
                {0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        System.out.println(
                "Index of row with maximum ls is "
                + rowWithMaxls(mat)
        );
    }
}
