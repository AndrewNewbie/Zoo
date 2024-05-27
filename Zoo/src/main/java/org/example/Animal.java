package org.example;

import java.util.ArrayList;

public class Animal {
    public int paws;
    public String sound;
    public String name;

    public void printCreatedAnimal() {
        String a = "Ви створили тварину " + this.name + ", у нього " + this.paws + " лапи і він видає звук " + this.sound;
        System.out.println(a);
    }

    public String getSound() {
        return this.sound;
    }

    public static int getPaws(ArrayList<Animal> animalsList) {
        int SumaPaws = 0;
        for (Animal animal : animalsList) {
            SumaPaws += animal.paws;
        }
        return SumaPaws;
    }
}