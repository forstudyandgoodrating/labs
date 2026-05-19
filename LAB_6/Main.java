public class Main {
    public static void main(String[] args) {
        System.out.println("--- Завдання 1: Клас Person ---");
        Person person1 = new Person();
        Person person2 = new Person("Андрій Цястун", 19);
        person1.talk();
        person2.move();

        System.out.println("\n--- Завдання 2: Клас Phone ---");
        Phone phone1 = new Phone("+380991234567", "iPhone 14", 172.0);
        Phone phone2 = new Phone("+380671112233", "Samsung S23");
        Phone phone3 = new Phone();
        
        System.out.println("Перевірка пустого телефону: " + phone3.getNumber());
        phone1.receiveCall("Мама");
        phone2.receiveCall("Куб", phone2.getNumber());
        phone1.sendMessage("+380990001122", "+380678889900");

        System.out.println("\n--- Завдання 3: Ієрархія Shape ---");
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        Ball ball = new Ball(7.0);
        Pyramid pyramid = new Pyramid(25.0, 10.0);
        
        System.out.println("Об'єм циліндра: " + cylinder.getVolume());
        System.out.println("Об'єм кулі: " + ball.getVolume());
        System.out.println("Об'єм піраміди: " + pyramid.getVolume());

        System.out.println("\n--- Завдання 4: Абстрактний клас Car ---");
        AbstractCar mySedan = new Sedan("Toyota Camry", "Чорний", 220);
        AbstractCar myTruck = new Truck("Volvo FH", "Білий", 120);
        
        mySedan.gas();
        mySedan.brake();
        myTruck.gas();
        myTruck.brake();

        System.out.println("\n--- Завдання 5 та 6: Тригонометричні комплексні числа ---");
        TrigComplexNumber complexNum = new TrigComplexNumber();
        complexNum.inputData(2.0, Math.PI / 4);
        complexNum.printData();
        complexNum.power(3);

        NamedComplexNumber specialNum = new NamedComplexNumber(5.0, Math.PI / 2, "Вектор А", "Червоний");
        specialNum.printData();
    }
}