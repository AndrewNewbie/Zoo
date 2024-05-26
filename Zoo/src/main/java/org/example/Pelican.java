package org.example;

import java.util.Scanner;

public class Pelican extends Animal {
    Scanner scanner = new Scanner(System.in);

    public void setValues(int paws, String sound, String name) {
        Scanner scanner = new Scanner(System.in);
        while (paws != 2) {
            System.out.println("Камон, у "+name+" не може бути "+paws+" лап, введіть кількість лап:");
            paws = scanner.nextInt();
        }
        this.paws = paws;
        this.sound = sound;
        this.name = name;
    }
}