package org.lessons.java.abstactAnimals;

public class Sparrow extends Animal {
    @Override
    public void noise() {
        System.out.println("Cip Cip");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating worms");
    }
}
