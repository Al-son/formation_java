package org.example.dsa.advanced_sort;

public class QuickSortApp {
    public static void main(String[] args) {
        int maxSize = 16;
        ArrayIns arr = new ArrayIns(maxSize);
        for (int j = 0; j < maxSize; j++) {
            long n = (int)(java.lang.Math.random()*99);
            arr.insert(n);
        }
//        arr.display();
//        arr.quickSort();
//        arr.display();
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
