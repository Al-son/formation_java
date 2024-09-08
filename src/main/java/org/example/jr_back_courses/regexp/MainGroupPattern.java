package org.example.jr_back_courses.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainGroupPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your email: ");
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("([A-Za-z0-9+.-]+)@([A-Za-z0-9+_]+)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            System.out.println("User name: " + matcher.group(1));
            System.out.println("Domain: " + matcher.group(2));
        }
    }
}
