package  org.example;

public class Transport {
    private float speed;
    private float weight;
    private String color;
    private byte[] coordinate;

    public Transport(){}

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        System.out.println("Object created");
        setValues(speed, weight, color, coordinate);
        System.out.println(getValues());
    }

    public Transport(float weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValues());
    }

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.color = color;
        this.weight = weight;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = "Object speed" + this.speed + ".Weight:" + this.weight + ".Color:" + this.color + ".\n";
        String infoCoordinate = "Coordinate:\n";
        for (int i = 0; i < coordinate.length; i++)
            infoCoordinate += coordinate[i] + "\n";
        return info + infoCoordinate;
    }
}
