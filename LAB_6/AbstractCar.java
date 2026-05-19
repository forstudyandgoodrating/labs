abstract class AbstractCar {
    String model;
    String color;
    int maxSpeed;

    public AbstractCar(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println(model + " газує! Вжжжж!");
    }

    public abstract void brake();
}

class Sedan extends AbstractCar {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Седан " + model + " плавно гальмує.");
    }
}

class Truck extends AbstractCar {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Вантажівка " + model + " різко гальмує! Пшшшш!");
    }
}