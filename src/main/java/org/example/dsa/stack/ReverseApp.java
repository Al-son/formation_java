package org.example.dsa.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter a String");
            System.out.flush();
            input = getString();
            if (input.isEmpty())
                break;

            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed: " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
