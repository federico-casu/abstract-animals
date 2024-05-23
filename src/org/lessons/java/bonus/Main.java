package org.lessons.java.bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        Device newDevice = null;

        while (newDevice == null) {
            System.out.println("What kind of device do you want to create?");
            choice = scanner.nextLine();
            try {
                newDevice = Creator.create(choice);
            } catch (IllegalArgumentException luisa) {
                System.out.println(luisa.getMessage());
            }
        }

        newDevice.play();
        newDevice.stop();

        scanner.close();
    }
}
