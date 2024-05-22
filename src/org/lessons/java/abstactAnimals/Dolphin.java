package org.lessons.java.abstactAnimals;

public class Dolphin extends Animal implements CanSwim {
    @Override
    public void noise() {
        System.out.println("Hihihihihi");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating anchovies");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
