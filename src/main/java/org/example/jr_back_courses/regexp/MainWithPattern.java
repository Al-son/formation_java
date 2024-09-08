package org.example.jr_back_courses.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainWithPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How to contact you: ");
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("\\b\\d{3}-\\b\\d{4}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println("Number found: " + matcher.group());
        }
    }
}
