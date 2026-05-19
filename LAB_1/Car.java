public class Car {
    private int horsePower;
    private double engineVolume;
    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean isAutomatic;

    public Car(int horsePower, double engineVolume, String brand, String model, int year, String color, boolean isAutomatic) {
        this.horsePower = horsePower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

    public int getHorsePower() { return horsePower; }
    public double getEngineVolume() { return engineVolume; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public boolean isAutomatic() { return isAutomatic; }
}