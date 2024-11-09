package org.example.dsa.LinkedList;

public class ListInsertionSortApp {
    public static void main(String[] args) {
        int size = 10;

        Link1[] linkArray = new Link1[size];

        for (int j = 0; j < size; j++) {
            int n = (int)(java.lang.Math.random()*99);
            Link1 newLink = new Link1(n);
            linkArray[j] = newLink;
        }

        System.out.println("Unsorted array: ");
        for (int j = 0; j < size; j++)
            System.out.println(linkArray[j].dData + " ");
        System.out.println(" ");

        SortedList theSortedList = new SortedList();

        for (int j = 0; j < size; j++)
            linkArray[j] = theSortedList.remove();

        System.out.println("Sorted array: ");
        for (int j = 0; j < size; j++)
            System.out.println(linkArray[j].dData + " ");
        System.out.println(" ");


    }
}
