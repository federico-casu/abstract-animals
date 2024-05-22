package org.lessons.java.bonus;

public class Playstation implements Device{
    @Override
    public void play() {
        System.out.println("I'm a Playstation and I'm in play mode");
    }

    @Override
    public void stop() {
        System.out.println("I'm a Playstation and I'm in stop mode");
    }
}
