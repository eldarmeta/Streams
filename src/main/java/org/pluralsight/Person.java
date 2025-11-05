package org.pluralsight;

public class Person {
    private String fisrtName;
    private String lastName;
    private int age;

    public Person(String fisrtName, String lastName, int age) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return fisrtName + " " + lastName + " (" + age + ")";
    }


}
