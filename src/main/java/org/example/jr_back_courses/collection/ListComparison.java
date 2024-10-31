package org.example.jr_back_courses.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add(1,"Charlie");
        arrayList.add("Julie");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add(1,"Charlie");
        linkedList.add("Julie");
    }
}
