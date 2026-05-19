import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створюємо один Scanner на всю програму
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Завдання 1: Квадратне рівняння ===");
        Task1.run(scanner);

        System.out.println("\n=== Завдання 2: Квадрант точки ===");
        Task2.run(scanner);

        System.out.println("\n=== Завдання 3: Перевірка числа ===");
        Task3.run(scanner);

        System.out.println("\n=== Завдання 4.1 (Варіант 18): Обчислення функції ===");
        Task4_1.run(scanner);

        System.out.println("\n=== Завдання 4.2 (Варіант 18): Текстове меню ===");
        Task4_2.run(scanner);

        scanner.close(); // Обов'язково закриваємо Scanner в кінці
        System.out.println("\nУсі завдання Варіанту 18 успішно виконано!");
    }
}