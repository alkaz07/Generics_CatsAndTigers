package org.example;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println("Р-ррррр");
    }
}
