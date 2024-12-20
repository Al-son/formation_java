package org.example.dsa.array.challenge;

import java.util.ArrayList;
import java.util.List;

public class DuplicatedNumber {

    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (!res.contains(arr[i])) {
                        res.add(arr[i]);
                    }
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 40, 12, 5, 6, 12, 11};
        List<Integer> duplicates = findDuplicates(arr);
        for (int x : duplicates) {
            System.out.println(x + " ");
        }
    }
}
