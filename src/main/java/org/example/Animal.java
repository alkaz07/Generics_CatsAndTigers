package org.example;

public abstract class Animal {
    abstract void say();
    String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animal(String name) {
        this.name = name;
    }
}
