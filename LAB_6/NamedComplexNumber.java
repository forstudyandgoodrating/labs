public class NamedComplexNumber extends TrigComplexNumber {
    String name;
    String color;

    public NamedComplexNumber(double r, double phi, String name, String color) {
        inputData(r, phi);
        this.name = name;
        this.color = color;
    }

    @Override
    public void printData() {
        System.out.print("Мітка [" + name + " | Колір: " + color + "] -> ");
        super.printData();
    }
}