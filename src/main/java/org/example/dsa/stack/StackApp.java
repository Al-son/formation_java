package org.example.dsa.stack;

public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);

        theStack.push((char) 20);
        theStack.push((char) 40);
        theStack.push((char) 60);
        theStack.push((char) 80);

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
