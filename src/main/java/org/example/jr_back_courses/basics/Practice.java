package org.example.jr_back_courses.basics;

public class Practice {
    static final int MAX = 1000;

    public static void main(String[] args) {
        System.out.println("Bonjour java");
        int[] table = new int[MAX]; // This code is allocated in the Heap
        for (int i = 0; i < MAX; i++) {
            table[i] = i; // This variable is allocated in the Stack
        }
    }

    // Variables
    Integer num1 = 10; // Authoboxing
    int num2 = num1;

    // Control structure
    public void condition() {
        int x = 10;
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Well done");
                break;
            default:
                System.out.println("To do well");
                break;
        }
    }

    public void circle() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        // While circle, the condition has to be true
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }
        // Do while, the condition will execute at least ones
        int k = 0;
        do {
            System.out.println("k = " + k); // This one will of course show
            k++;
        } while (k < 5);

        boolean isAdult = true;
        int age = 20;

        if (isAdult && age >= 18) {
            System.out.println("You are an adult");
        }
    }
}
