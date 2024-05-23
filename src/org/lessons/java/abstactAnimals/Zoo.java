package org.lessons.java.abstactAnimals;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Sparrow(), new Eagle(), new Dolphin() };

        for (int i = 0; i < animals.length; i++) {
            animals[i].noise();
            animals[i].eat();
            animals[i].sleep();

            if (animals[i] instanceof CanFly) {
//                ((CanFly) animals[i]).fly();
                makeFly((CanFly) animals[i]);
            } else if (animals[i] instanceof CanSwim) {
//                ((CanSwim) animals[i]).swim();
                makeSwim((CanSwim) animals[i]);
            }
        }
    }

    private static void makeFly(CanFly animal) {
        animal.fly();
    }

    private static void makeSwim(CanSwim animal) {
        animal.swim();
    }
}
