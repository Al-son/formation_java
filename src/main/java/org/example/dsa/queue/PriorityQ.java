package org.example.dsa.queue;

public class PriorityQ {
    private int maxSize;
    private long[] quArray;
    private int nItems;


    public PriorityQ(int s) {
        maxSize = s;
        quArray = new long[s];
        nItems = 0;
    }

    public void insert(long item) {
        int j;
        if (nItems == 0) {
            quArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j >= 0; j++) {
                if (item > quArray[j])
                    quArray[j + 1] = quArray[j];
                else
                    break;
            }
            quArray[j + 1] = item;
            nItems++;
        }
    }

    public long remove() {
        return quArray[nItems--];
    }

    public long peekMin() {
        return quArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
