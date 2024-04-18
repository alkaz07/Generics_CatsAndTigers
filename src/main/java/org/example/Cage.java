package org.example;

public class Cage {
    private Animal animal=null;
    public boolean isEmpty(){
        return animal == null;
    }

    public void put(Animal a){
        if( isEmpty())
        {
            animal = a;
            System.out.println("в клетку посадаили "+a);
        }
        else
            System.out.println("клетка уже занята "+animal);

    }

    public Animal takeOut(){
        System.out.println("достаем из клетки "+animal);
        Animal a = animal;
        animal=null;
        return a;
    }
}
