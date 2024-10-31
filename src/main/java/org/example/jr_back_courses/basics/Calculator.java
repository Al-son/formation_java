package org.example.jr_back_courses.basics;

import java.util.Scanner;

public class Calculator {
    static final String MENU =
            "\n1. Addition\n2. Soustraction\n3. Multiplication\n" +
                    "4. Division\n5. Quitter";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(MENU);
            System.out.println("Choose your operation: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the calculator");
                break;
            }
            System.out.println("Enter your first number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter your second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0 ) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division error");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("The result is: " + result);
        }
        sc.close();
    }
}
