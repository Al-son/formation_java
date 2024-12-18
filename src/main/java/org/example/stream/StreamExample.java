package org.example.stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
        System.out.println("----------------------------------------------");

        // Terminal operations
        List<String> list6 = Arrays.asList("apple", "banana", "cherry");
        list6.stream()
                .forEach(System.out::println);

        List<String> list7 = Arrays.asList("apple", "banana", "cherry");
        List<String> result = list7.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("----------------------------------------------");

        List<Integer> list8 = Arrays.asList(1, 2, 3, 4);
        int sum = list8.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("------------------------------------------------");

        List<Integer> list9 = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> max = list9.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);
        System.out.println("--------------------------------------------------");

        List<String> list10 = Arrays.asList("apple", "banana", "cherry");
        boolean containsA = list10.stream().anyMatch(s -> s.contains("a"));
        System.out.println(containsA);
        System.out.println("-----------------------------------------------------");

        List<String> list11 = Arrays.asList("apple", "banana", "cherry");
        Optional<String> first = list11.stream().findFirst();
        first.ifPresent(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<String> list12 = Arrays.asList("apple", "banana", "cherry", "date");
        list12.parallelStream()
                .forEach(s -> System.out.printf(s + "(processed by " + Thread.currentThread().getName() + ")"));
    }

}
