package org.example.dsa.LinkedList;

import javax.swing.*;

public class LinkQueue {
    private FirstLastList thLast;

    public LinkQueue() {
        thLast = new FirstLastList();
    }

    public boolean isEmpty() {
        return thLast.isEmpty();
    }

    public void insert(long j) {
        thLast.insertLast(j);
    }

    public long remove() {
        return thLast.displayList();
    }

    public void displayQueue() {
        System.out.println("Queue (Queue (front-->rear)");
        thLast.displayList();
    }
}
