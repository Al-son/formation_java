package org.example.dsa.advanced_sort;

public class ArrayPar {
    private final long[] theArray;
    private int nElems;

    public ArrayPar(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    public int size() {
        return nElems;
    }

    public void display() {
        System.out.println("A=");
        for (int j = 0; j < nElems; j++)
            System.out.printf(theArray[j] + " ");
        System.out.println();
    }

    public int partition(int left, int right, long pivot){
        int leftPrt = left - 1;
        int rightPtr = right + 1;
        while(true) {
            while (leftPrt < right && theArray[++leftPrt] < pivot);
            while (rightPtr > left && theArray[--rightPtr] > pivot);
            if (leftPrt >= rightPtr)
                break;
            else
                swap(leftPrt, rightPtr);
        }
        return leftPrt;
    }

    public void swap(int dex1, int dex2){
        long temp;
        temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
}
