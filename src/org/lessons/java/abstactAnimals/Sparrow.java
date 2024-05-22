package org.lessons.java.abstactAnimals;

public class Sparrow extends Animal implements CanFly {
    @Override
    public void noise() {
        System.out.println("Cip Cip");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating worms");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
