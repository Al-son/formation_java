package org.example.dsa.recursion;

public class BinarySearchApp {
    public static void main(String[] args) {
        int maxSize = 100;
        BinarySearch binarySearch = new BinarySearch(maxSize);
        binarySearch.insert(72);
        binarySearch.insert(90);
        binarySearch.insert(45);
        binarySearch.insert(126);
        binarySearch.insert(54);
        binarySearch.insert(99);
        binarySearch.insert(144);
        binarySearch.insert(27);
        binarySearch.insert(135);
        binarySearch.insert(81);
        binarySearch.insert(18);
        binarySearch.insert(108);
        binarySearch.insert(9);
        binarySearch.insert(117);
        binarySearch.insert(63);
        binarySearch.insert(36);

        binarySearch.display();

        int searchKey = 27;
        if (binarySearch.find(searchKey) != binarySearch.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
    }
}

