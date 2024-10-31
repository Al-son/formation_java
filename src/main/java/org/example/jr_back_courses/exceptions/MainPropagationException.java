package org.example.jr_back_courses.exceptions;

import java.io.IOException;

public class MainPropagationException {
    public static void main(String[] args) throws Exception {

        try {
            methodGenerated();
        } catch (IOException e) {
            System.out.println("Found the mistake" + e.getMessage());
        } finally {
            System.out.println("We ended with exception");
        }

    }
    public static void methodGenerated() throws IOException {
        throw new IOException("The mistake is here!");
    }
}
