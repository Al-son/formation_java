package org.example.dsa.queue;

public class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ thPQ = new PriorityQ(5);
        thPQ.insert(30);
        thPQ.insert(50);
        thPQ.insert(10);
        thPQ.insert(40);
        thPQ.insert(20);

        while (!thPQ.isEmpty()){
            long item = thPQ.remove();
            System.out.print(item + " ");
        }
    }
}
