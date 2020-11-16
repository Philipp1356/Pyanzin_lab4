package ru.mirea.gib04.lab4.var1;

public final class Person implements Nameable {

    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    @Override
    public String name() {
        return firstName + " " + lastName;
    }
}