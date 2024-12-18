package org.example.jr_back_courses.designPattern;

public class Singleton {
    private static Singleton single_instance = null;
    private String s;

    private Singleton() {
        s = "Hello i am a string part of Singleton class";
    }

    public static synchronized Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}
