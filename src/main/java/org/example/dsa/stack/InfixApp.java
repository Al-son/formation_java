package org.example.dsa.stack;

import java.io.IOException;

import static org.example.dsa.stack.ReverseApp.getString;

public class InfixApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        System.out.println("Welcome to the Infix to Postfix Converter!");
        while (true) {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = getString();

            if (input.isEmpty()) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            }
            try {
                InToPost theTrans = new InToPost(input);
                output = theTrans.doTrans();
                System.out.println("Postfix is: " + output + '\n');
            } catch (Exception e) {
                System.out.println("Error processing expression: " + e.getMessage());
            }
        }
    }
}
