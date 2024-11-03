package org.example.dsa.queue;

public class Queue {
    private long[] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void insert(long value) {
        if (currentSize < maxSize) {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            currentSize++;
        } else {
            System.out.println("Queue is full. Cannot insert " + value);
        }
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove element.");
            return -1; // Or throw an exception
        } else {
            long value = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return value;
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }
}
