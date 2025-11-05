package org.pluralsight;

import java.util.*;

public class Program {
    public  static void main (String[] args) {
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
        System.out.print("Enter a name to search (filter or last): ");
        String search = scanner.nextLine().toLowerCase().trim();

        List<Person> matches = new ArrayList<>();
        for (Person p  : people) {
            if (p.getFisrtName().toLowerCase().contains(search) ||
                    p.getLastName().toLowerCase().contains(search)) {
                matches.add(p);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            System.out.println("Matches:");
            for (Person m : matches) {
                System.out.println(m);
            }
        }
        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person p : people) {
            int age = p.getAge();
            totalAge += age;

            if (age > oldest) oldest = age;
            if (age < youngest) youngest = age;
        }

        double average = (double) totalAge / people.size();

        System.out.println("\nAverage age: " + average);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}
