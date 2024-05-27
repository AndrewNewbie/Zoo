package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Animal> animalsList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Введіть кількість тварин:");
        int numberAnimals = scanner.nextInt();
        for (int i = 0; i < numberAnimals; i++) {
            System.out.println("Виберіть тип тварини, яку хочете додати:1-Cat, 2-Spider, 3-HoneyEater, 4-Octopus, 5-Pelican:");
            int typeAnimal = scanner.nextInt();
            switch (typeAnimal) {
                case 1:
                    animalCat();
                    break;
                case 2:
                    animalSpider();
                    break;
                case 3:
                    animalHoneyEater();
                    break;
                case 4:
                    animalOctopus();
                    break;
                case 5:
                    animalPelican();
                    break;
            }
        }
        System.out.println("Ви ввели усіх тварин, виберіть опцію зоопарку\n1 - Послухати, 2 - Порахувати кількість усіх лап: ");
        int SelectOptions = scanner.nextInt();
        if (SelectOptions == 1) {
            for (Animal el : animalsList) {
                System.out.println(el.name + " видає звук -" + el.getSound());
            }
        }
        if (SelectOptions == 2) {
            System.out.println("кількість усіх лап:" + Animal.getPaws(animalsList));
        }
    }

    public static void animalCat() {
        Cat cat = new Cat();
        System.out.println("Ви обрали кота, введіть кількість лап:");
        int paws = scanner.nextInt();
        System.out.println("Який звук видає кіт:");
        scanner.nextLine();
        String sound = scanner.nextLine();

        cat.setValues(paws, sound, "Cat");
        cat.printCreatedAnimal();
        System.out.println("Введіть наступну тварину");

        animalsList.add(cat);
    }

    public static void animalSpider() {
        Spider spider = new Spider();
        System.out.println("Ви обрали павука, введіть кількість лап:");
        int paws = scanner.nextInt();
        System.out.println("Який звук видає паук:");
        scanner.nextLine();
        String sound = scanner.nextLine();
        spider.setValues(paws, sound, "Spider");
        spider.printCreatedAnimal();
        System.out.println("Введіть наступну тварину");

        animalsList.add(spider);

    }

    public static void animalHoneyEater() {
        HoneyEater honeyEater = new HoneyEater();
        System.out.println("Ви обрали медоїда, введіть кількість лап:");
        int paws = scanner.nextInt();
        System.out.println("Який звук видає медоїд:");
        scanner.nextLine();
        String sound = scanner.nextLine();
        honeyEater.setValues(paws, sound, "HoneyEater");
        honeyEater.printCreatedAnimal();
        System.out.println("Введіть наступну тварину");

        animalsList.add(honeyEater);
    }

    public static void animalOctopus() {
        Octopus octopus = new Octopus();

        System.out.println("Ви обрали восьминога, введіть кількість лап:");
        int paws = scanner.nextInt();
        System.out.println("Який звук видає Восьминіг:");
        scanner.nextLine();
        String sound = scanner.nextLine();
        octopus.setValues(paws, sound, "Octopus");
        octopus.printCreatedAnimal();
        System.out.println("Введіть наступну тварину");

        animalsList.add(octopus);
    }

    public static void animalPelican() {
        Pelican pelican = new Pelican();
        System.out.println("Ви обрали пелікана, введіть кількість лап:");
        int paws = scanner.nextInt();
        System.out.println("Який звук видає пелікан:");
        scanner.nextLine();
        String sound = scanner.nextLine();
        pelican.setValues(paws, sound, "Pelican");
        pelican.printCreatedAnimal();
        System.out.println("Введіть наступну тварину");

        animalsList.add(pelican);
    }
}
