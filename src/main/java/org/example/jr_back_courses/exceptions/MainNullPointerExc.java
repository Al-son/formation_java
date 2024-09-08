package org.example.jr_back_courses.exceptions;

public class MainNullPointerExc {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length()); // This line generated a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException was found right here");
        } catch (Exception e) {
            System.out.println("Generated error:" + e.getMessage());
        }
    }
}
