package org.example.dsa.array;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == searchKey)
                break;
        return j != nElems;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == value)
                break;
        if (j == nElems)
            return false;
        else if (nElems - j >= 0) System.arraycopy(a, j + 1, a, j, nElems - j);
            nElems--;
            return true;
    }

    public void display() {
        int j;
        for (j = 0; j < nElems; j++)
            System.out.println(a[j] + " ");
            System.out.println(" ");
    }
}
