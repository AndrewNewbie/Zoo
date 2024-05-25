package org.example;

public class Animal {
    public int paws;
    public String sound;
    public String name;

    public void getValues() {
        String a = "Ви створили тварину "+this.name+", у нього "+this.paws+" лапи і він видає звук "+this.sound;
        System.out.println(a);
    }
    public String getSound(){
        return this.sound;
    }
}
