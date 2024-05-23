package org.example;

public class Animal {
    protected int paws;
    protected String sound;
    protected String name;

    public void getValues() {
        String a = "Ви створили тварину "+this.name+", у нього "+this.paws+" лапи і він видає звук "+this.sound;
        System.out.println(a);
    }
}
