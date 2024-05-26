package org.example;

public class Truck extends Transport {
    private boolean isLoaded;

    public Truck(float weight, byte[] coordinate) {
        super(weight, coordinate);
    }
    public Truck(float weight, byte[] coordinate,boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded=isLoaded;
    }
    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public void getLoaded() {
        if (isLoaded)
            System.out.println("Грузовик загружен");
        else
            System.out.println("Грузовик не загружен");
    }
}