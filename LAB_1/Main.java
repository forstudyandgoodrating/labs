public class Main {
    public static void main(String[] args) {
        System.out.println("=== Завдання 1 ===");
        Task1.run();

        System.out.println("\n=== Завдання 2 ===");
        Task2.run();

        System.out.println("\n=== Завдання 3 ===");
        runTask3();

        System.out.println("\n=== Завдання 4 ===");
        runTask4();

        System.out.println("\n=== Завдання 5 ===");
        Task5.run();
    }

    private static void runTask3() {
        User[] users = {
            new User(1, 20, "Олександр", "Коваленко", 70.5, 1.75),
            new User(2, 22, "Марія", "Шевченко", 55.0, 1.65),
            new User(3, 19, "Іван", "Бойко", 80.2, 1.82),
            new User(4, 25, "Олена", "Ткачук", 62.0, 1.70),
            new User(5, 30, "Дмитро", "Кравченко", 90.0, 1.88),
            new User(6, 21, "Анна", "Мельник", 50.5, 1.60),
            new User(7, 24, "Максим", "Волков", 75.0, 1.78),
            new User(8, 28, "Юлія", "Мороз", 60.0, 1.68),
            new User(9, 23, "Андрій", "Лисенко", 82.5, 1.85),
            new User(10, 26, "Вікторія", "Савченко", 58.0, 1.67)
        };

        int totalAge = 0;
        double totalWeight = 0;
        double totalHeight = 0;

        for (User user : users) {
            totalAge += user.getAge();
            totalWeight += user.getWeight();
            totalHeight += user.getHeight();
        }

        System.out.printf("Загальний вік: %d років\n", totalAge);
        System.out.printf("Загальна вага: %.2f кг\n", totalWeight);
        System.out.printf("Загальний зріст: %.2f м\n", totalHeight);
    }

    private static void runTask4() {
        Car[] cars = {
            new Car(150, 2.0, "Toyota", "Corolla", 2020, "Білий", true),
            new Car(200, 2.5, "Honda", "Camry", 2021, "Чорний", true),
            new Car(110, 1.6, "Volkswagen", "Golf", 2018, "Синій", false),
            new Car(300, 3.0, "BMW", "X5", 2022, "Сірий", true),
            new Car(180, 2.4, "Hyundai", "Sonata", 2019, "Червоний", true),
            new Car(250, 2.8, "Audi", "A6", 2021, "Чорний", true),
            new Car(100, 1.4, "Skoda", "Fabia", 2017, "Зелений", false),
            new Car(130, 1.8, "Kia", "Ceed", 2020, "Білий", true),
            new Car(350, 3.5, "Mercedes", "GLE", 2023, "Сріблястий", true),
            new Car(140, 2.0, "Mazda", "3", 2019, "Червоний", true)
        };

        double totalVolume = 0;
        int totalPower = 0;

        for (Car car : cars) {
            totalVolume += car.getEngineVolume();
            totalPower += car.getHorsePower();
        }

        System.out.printf("Загальний об'єм двигунів: %.1f л\n", totalVolume);
        System.out.printf("Загальна потужність: %d к.с.\n", totalPower);
    }
}