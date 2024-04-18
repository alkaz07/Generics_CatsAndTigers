package org.example;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println("мяу");
    }
}
