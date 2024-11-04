package org.example.dsa.stack;


import java.io.IOException;

import static org.example.dsa.stack.BracketApp.getString;

public class PostFixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;
        while (true) {
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }
            ParsePost postFixApp = new ParsePost(input);
            output = postFixApp.doParse();
            System.out.println("Evaluates to " + output);
        }
    }
}
