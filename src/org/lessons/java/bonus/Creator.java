package org.lessons.java.bonus;

public class Creator {
    public static Device create(String type) {
        if (type.equalsIgnoreCase("playstation")){
            return new Playstation();
        } else {
            return new DvdPlayer();
        }
    }
}
