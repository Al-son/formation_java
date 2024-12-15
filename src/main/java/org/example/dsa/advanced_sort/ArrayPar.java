package org.example.dsa.advanced_sort;

import javax.swing.plaf.PanelUI;

public class ArrayPar {
    private long[] theArray;
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
}
