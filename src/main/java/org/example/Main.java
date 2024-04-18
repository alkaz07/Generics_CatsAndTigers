package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //example1();
        //example2();
        example3();
    }

    private static void example3() {
        BoxForPair<Cat> box1 = new BoxForPair<>();
        box1.put(new Cat("Баська"));
        box1.put(new Cat("Прима"));

        BoxForPair<Cat> box2 = new BoxForPair<>();
        box2.put(new Cat("Мурзик"));

        if(box1.compareByFilling(box2)>0)
            System.out.println("в 1 коробке народу больше");
        else
            System.out.println("в 1 коробке народу не больше");

        BoxForPair<Tiger> box3 = new BoxForPair<>();
        box3.put(new Tiger("Шер"));
        box3.put(new Tiger("Хан"));

        if(box3.compareByFilling(box1)>0)
            System.out.println("в 3 коробке народу больше");
        else
            System.out.println("в 3 коробке народу не больше");

        ArrayList<Tiger> tigers = new ArrayList<>();
        tigers.add(box3.takeOut());
        Consumer<Animal> actor = animal -> System.out.println("я работаю с "+animal);
        tigers.forEach(actor);
    }

    private static void example2() {
        BoxForPair<Cat> box = new BoxForPair<>();
        box.put(new Cat("Баська"));
        box.put(new Cat("Прима"));
        System.out.println(box);
        Cat c =box.takeOut();
        //box.put(new Tiger("Оля"));

      //  BoxForPair<String> box1=new BoxForPair<>();
      //  box1.put("ай-ай");
      //  box1.put("эй-эй");
      //  System.out.println(box1);

    }

    private static void example1() {
        Cage cage = new Cage();
        Tiger tiger = new Tiger("Шер-хан");
        Cat cat = new Cat("Мурзик");
        cage.put(tiger);
        cage.takeOut();

        cage.put(cat);
        cage.put(tiger);


    }
}