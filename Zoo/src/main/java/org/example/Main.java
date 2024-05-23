package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Spider spider = new Spider();
        Cat cat = new Cat();
        HoneyEater honeyEater = new HoneyEater();
        Octopus octopus = new Octopus();
        Pelican pelican = new Pelican();


        ArrayList<String> animals = new ArrayList<>();
        ArrayList<String> sounds = new ArrayList<>();
        int numberPaws = 0;

        System.out.println("Введіть кількість тварин:");
        int numberAnimals = scanner.nextInt();
        for (int i = 0; i < numberAnimals; i++) {
            System.out.println("Виберіть тип тварини, яку хочете додати:1-Cat, 2-Spider, 3-HoneyEater, 4-Octopus, 5-Pelican:");
            int typeAnimal = scanner.nextInt();
            if (typeAnimal == 1) {

                System.out.println("Ви обрали кота, введіть кількість лап:");
                int paws = scanner.nextInt();
                System.out.println("Який звук видає кіт:");
                scanner.nextLine();
                String sound = scanner.nextLine();

                cat.setValues(paws, sound, "Cat");
                cat.getValues();
                System.out.println("Введіть наступну тварину");

                animals.add(i, "Cat");
                sounds.add(i, cat.sound);
                numberPaws = +cat.paws;
            }
            if (typeAnimal == 2) {
                System.out.println("Ви обрали павука, введіть кількість лап:");
                int paws = scanner.nextInt();
                System.out.println("Який звук видає паук:");
                scanner.nextLine();
                String sound = scanner.nextLine();
                spider.setValues(paws, sound, "Spider");
                spider.getValues();
                System.out.println("Введіть наступну тварину");

                animals.add(i, "Spider");
                sounds.add(i, spider.sound);
                numberPaws = +cat.paws;
            }
            if (typeAnimal == 3) {
                System.out.println("Ви обрали медоїда, введіть кількість лап:");
                int paws = scanner.nextInt();
                System.out.println("Який звук видає медоїд:");
                scanner.nextLine();
                String sound = scanner.nextLine();
                honeyEater.setValues(paws, sound, "HoneyEater");
                honeyEater.getValues();
                System.out.println("Введіть наступну тварину");

                animals.add(i, "HoneyEater");
                sounds.add(i, honeyEater.sound);
                numberPaws = +honeyEater.paws;
            }
            if (typeAnimal == 4) {
                System.out.println("Ви обрали восьминога, введіть кількість лап:");
                int paws = scanner.nextInt();
                System.out.println("Який звук видає Восьминіг:");
                scanner.nextLine();
                String sound = scanner.nextLine();
                octopus.setValues(paws, sound, "Octopus");
                octopus.getValues();
                System.out.println("Введіть наступну тварину");

                animals.add(i, "Octopus");
                sounds.add(i, octopus.sound);
                numberPaws = +octopus.paws;
            }
            if (typeAnimal == 5) {
                System.out.println("Ви обрали пелікана, введіть кількість лап:");
                int paws = scanner.nextInt();
                System.out.println("Який звук видає пелікан:");
                scanner.nextLine();
                String sound = scanner.nextLine();
                pelican.setValues(paws, sound, "Pelican");
                pelican.getValues();
                System.out.println("Введіть наступну тварину");

                animals.add(i, "Pelican");
                sounds.add(i, pelican.sound);
                numberPaws = +pelican.paws;
            }
        }
        System.out.println("Ви ввели усіх тварин, виберіть опцію зоопарку\n1 - Послухати, 2 - Порахувати кількість усіх лап: ");
        int oneTwo = scanner.nextInt();
        if (oneTwo == 1) {
            for (int i = 0; i < numberAnimals; i++) {
                System.out.println(animals.get(i)+" видає звук -"+sounds.get(i));
            }
        } else
            System.out.println("кількість усіх лап:" + numberPaws);
    }
}
