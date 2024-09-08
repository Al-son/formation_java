package org.example.jr_back_courses.regexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String emailRegex = "^[A-Za-z0-9+.-]+@[A-Za-z0-9.-]+$";
        Scanner sc = new Scanner(System.in);
        System.out.println("Your email: ");
        String email = sc.nextLine();

        if (email.matches(emailRegex)){
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
