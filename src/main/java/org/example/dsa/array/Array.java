package org.example.dsa.array;


public class Array {

    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 0;
        int j;
        long searchKey;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;

        // Display elements
        for (j = 0; j < nElems; j++) {
            System.out.println(arr[j] + "");
        }

        // Search Elements
        searchKey = 66;
        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;
        if (j == searchKey)
            System.out.println("Can't find the element " + searchKey);
        else
            System.out.println("Found " + searchKey);


        // Delete the element
        searchKey = 55;
        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;
        if (nElems - j >= 0) System.arraycopy(arr, j + 1, arr, j, nElems - j);
        nElems--;

        // Print the elements
        for (j = 0; j < nElems; j++)
            System.out.println(arr[j] + "");
        System.out.println(" ");
    }
}
