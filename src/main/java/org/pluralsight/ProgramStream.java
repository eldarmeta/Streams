package org.pluralsight;

import java.util.*;
import java.util.stream.Collectors;

public class ProgramStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = Arrays.asList(
            new Person("Alice", "Johnson", 28),
            new Person("Bob", "Smith", 35),
            new Person("Carol", "Brown", 22),
            new Person("David", "Miller", 40),
            new Person("Eve", "Wilson", 19),
            new Person("Frank", "Taylor", 45),
            new Person("Grace", "Davis", 31),
            new Person("Hank", "Moore", 29),
            new Person("Ivy", "Anderson", 33),
            new Person("Jack", "Thomas", 25)
        );

        System.out.print("Enter a name to search (first or last): ");
        String search = scanner.nextLine().trim().toLowerCase();

        List<Person> matches = people.stream()
            .filter(p ->
                p.getFirstName().toLowerCase().contains(search) ||
                p.getLastName().toLowerCase().contains(search)
            )
            .collect(Collectors.toList());

        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            System.out.println("Matches:");
            matches.forEach(System.out::println);
        }

        OptionalDouble avg = people.stream()
            .mapToInt(Person::getAge)
            .average();

        OptionalInt max = people.stream().mapToInt(Person::getAge).max();
        OptionalInt min = people.stream().mapToInt(Person::getAge).min();

        System.out.println();
        System.out.println("Average age: " + (avg.isPresent() ? avg.getAsDouble() : "N/A"));
        System.out.println("Oldest age: " + (max.isPresent() ? max.getAsInt() : "N/A"));
        System.out.println("Youngest age: " + (min.isPresent() ? min.getAsInt() : "N/A"));
    }
}