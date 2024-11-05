package org.example.dsa.LinkedList;

import javax.swing.plaf.PanelUI;

public class LinkListForStack {
    private LinkForStack first;

    public LinkListForStack() {
        first = null;
    }

    public void insertFirst(long dd) {
        LinkForStack newLink = new LinkForStack(dd);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst() {
        LinkForStack temp = first;
        first = first.next;
        return temp.dData;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayList() {
        LinkForStack current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
     }
}
