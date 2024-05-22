package org.lessons.java.abstactAnimals;

public class Dolphin extends Animal {
    @Override
    public void noise() {
        System.out.println("Hihihihihi");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating anchovies");
    }
}
