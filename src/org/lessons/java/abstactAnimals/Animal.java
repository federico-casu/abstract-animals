package org.lessons.java.abstactAnimals;

public abstract class Animal {
    public void sleep() {
        System.out.println("Zzz");
    }

    public abstract void noise();
    public abstract void eat();
}
