package org.example.dsa.stack;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int[] stackArray1;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full. Cannot push " + j);
        }
        stackArray[++top] = j;
    }
    public void pushPost(int j) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full. Cannot push " + j);
        }
        stackArray1[++top] = j;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return stackArray[top--];
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public char peekN(int n) {
        if (n < 0 || n > top) {
            throw new IndexOutOfBoundsException("Index " + n + " is out of bounds.");
        }
        return stackArray[n];
    }

    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom-->top: ");
        for (int j = 0; j <= top; j++) {
            System.out.print(stackArray[j] + " ");
        }
        System.out.println();
    }
}
