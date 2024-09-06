package org.example.dsa.array;

public class OrderArray {
    private long[] arr;
    private int nElems;

    public OrderArray(int max){
        arr = new long[max];
        nElems = 0;
    }

    public long size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (arr[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (arr[curIn] < searchKey)
                    lowerBound = curIn +  1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(long value){
        int j;
        for (j = 0; j < nElems; j++)
            if (arr[j] > value)
                break;
        for (int k = nElems; k > j; k--)
            arr[k] = arr[k - 1];
        arr[j] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                arr[k] = arr[k + 1];
            arr[j] = value;
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int j = 0; j < nElems; j++)
            System.out.println(arr[j] + " ");
        System.out.println(" ");
    }
}
