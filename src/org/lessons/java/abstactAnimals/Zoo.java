package org.lessons.java.abstactAnimals;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Sparrow(), new Eagle(), new Dolphin() };

        for (int i = 0; i < animals.length; i++) {
            animals[i].noise();
            animals[i].eat();
            animals[i].sleep();
        }
    }
}
