package org.example.jr_back_courses.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            int divided = 10 / 0; // Zero division
            System.out.println(divided);
        } catch (ArithmeticException e) {
            System.out.println("Zero division");
        }
    }
}
