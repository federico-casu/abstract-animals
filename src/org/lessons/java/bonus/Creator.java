package org.lessons.java.bonus;

public class Creator {
    public static Device create(String type) throws IllegalArgumentException {
        if (type.equalsIgnoreCase("playstation")){
            return new Playstation();
        } else if (type.equalsIgnoreCase("dvd player")) {
            return new DvdPlayer();
        } else {
            throw new IllegalArgumentException("Unable to generate this device");
        }
    }
}
