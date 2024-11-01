package org.example.dsa.stack;

public class StackX {
    private int maxSize;
    private long[] StackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        StackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        StackArray[++top] = j;
    }

    public long pop() {
        return StackArray[top--];
    }

    public long peek() {
        return StackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }
}
