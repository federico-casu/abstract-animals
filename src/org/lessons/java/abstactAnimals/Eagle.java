package org.lessons.java.abstactAnimals;

public class Eagle extends Animal implements CanFly {


    @Override
    public void noise() {
        System.out.println("Eagle Eagle");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating fishes");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
