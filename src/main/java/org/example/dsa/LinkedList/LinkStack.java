package org.example.dsa.LinkedList;

public class LinkStack {
    private LinkListForStack theList;

    public LinkStack() {
        theList = new LinkListForStack();
    }

    public void push(long j) {
        theList.insertFirst(j);
    }

    public long pop() {
        return theList.deleteFirst();
    }

    public boolean isEmpty() {
        return (theList.isEmpty());
    }

    public void displayStack() {
        System.out.println("Stack(top-->bottom)");
        theList.displayList();
    }
}
