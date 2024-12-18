package org.example.dsa.tree;

public class Node {
    int iData;
    double dDate;
    public Node leftChild;
    public Node rightChild;

    public void displayNode() {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dDate);
        System.out.print("} ");
    }
}
