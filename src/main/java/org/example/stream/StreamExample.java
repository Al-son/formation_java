package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();

        String[] array = {"apple", "banana", "cherry"};
        Stream<String> stream1 = Arrays.stream(array);

        Stream<String> stream2 = Stream.of("apple", "banana", "cherry");

        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);

        // Intermediate Operations
        List<String> list1 = Arrays.asList("apple", "banana", "cherry", "avocado");
        list1.stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        List<String> list2 = Arrays.asList("apple", "banana", "cherry");
        list2.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------");

        List<String> list3 = Arrays.asList("apple", "banana", "apple", "cherry");
        list3.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        List<String> list4 = Arrays.asList("apple", "banana", "cherry");
        list4.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------");

        List<String> list5 = Arrays.asList("apple", "banana", "cherry");
        list5.stream()
                .peek(s -> System.out.printf("Element: " + s))
                .collect(Collectors.toList());

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g", "h")
        );
        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
