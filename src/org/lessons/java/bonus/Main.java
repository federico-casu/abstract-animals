package org.lessons.java.bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("What kind of device do you want to create?");
        choice = scanner.nextLine();

        Device newDevice = Creator.create(choice);

        newDevice.play();
        newDevice.stop();

        scanner.close();
    }
}
