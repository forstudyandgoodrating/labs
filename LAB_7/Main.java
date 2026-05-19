/**
 * Виконав: студент групи АП-22, Андрій Цястун
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("============== ЗАВДАННЯ 1: СЕРВІС ТАКСІ ==============");
        
        // 1. Створення колекції автомобілів
        ArrayList<TaxiCar> taxiFleet = new ArrayList<>();

        // Створення 10 автомобілів з водіями
        taxiFleet.add(new TaxiCar("Toyota Prius", 100.0, new Driver("Іван", 30, 8), 15000, 2015));
        taxiFleet.add(new TaxiCar("Skoda Octavia", 110.0, new Driver("Петро", 26, 3), 16000, 2016));
        taxiFleet.add(new TaxiCar("Renault Megane", 90.0, new Driver("Олег", 45, 20), 12000, 2012));
        taxiFleet.add(new TaxiCar("Volkswagen Golf", 105.0, new Driver("Максим", 22, 1), 14000, 2014));
        taxiFleet.add(new TaxiCar("Ford Focus", 100.0, new Driver("Андрій", 28, 4), 13000, 2013));
        taxiFleet.add(new TaxiCar("Hyundai Sonata", 150.0, new Driver("Сергій", 35, 12), 18000, 2018));
        taxiFleet.add(new TaxiCar("Kia Optima", 140.0, new Driver("Дмитро", 27, 4), 17000, 2017));
        taxiFleet.add(new TaxiCar("Nissan Leaf", 109.0, new Driver("Василь", 50, 25), 11000, 2015));
        taxiFleet.add(new TaxiCar("Mazda 6", 160.0, new Driver("Олександр", 24, 2), 19000, 2019));
        taxiFleet.add(new TaxiCar("Peugeot 308", 115.0, new Driver("Тарас", 32, 6), 14500, 2016));

        // 2. Ремонт половини автопарку (збільшення потужності на 10% та нові водії)
        for (int i = 0; i < taxiFleet.size() / 2; i++) {
            TaxiCar car = taxiFleet.get(i);
            car.power = car.power * 1.10; 
            car.driver = new Driver("Новий_Водій_" + i, 25 + i, 5); // Найняли нових
        }

        // 3. Кожна друга машина: підвищення потужності на 10% і ціни на 5%
        for (int i = 1; i < taxiFleet.size(); i += 2) {
            TaxiCar car = taxiFleet.get(i);
            car.power = car.power * 1.10;
            car.price = car.price * 1.05;
        }

        // 4. Перевірка досвіду всіх водіїв
        for (TaxiCar car : taxiFleet) {
            if (car.driver.experience < 5 && car.driver.age > 25) {
                car.driver.experience += 1;
            }
        }

        // 5. Виклик методів з Helper
        Helper.dispatchRandomCar(taxiFleet);

        System.out.println("\n============== ЗАВДАННЯ 2: ТЕЛЕФОННА КНИГА ==============");
        Task2.run();
    }
}