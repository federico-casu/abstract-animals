package org.lessons.java.abstactAnimals;

public class Dog extends Animal {
    @Override
    public void noise() {
        System.out.println("Wof Wof");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating everything");
    }


}
