public class TaxiCar {
    String brand;
    double power;   // Кінські сили
    Driver driver;
    double price;   // Ціна авто
    int year;

    public TaxiCar(String brand, double power, Driver driver, double price, int year) {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }
}