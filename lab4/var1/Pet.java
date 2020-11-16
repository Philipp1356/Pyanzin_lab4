package ru.mirea.gib04.lab4.var1;

public final class Pet implements Nameable {

    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}