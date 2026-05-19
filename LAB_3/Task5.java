import java.util.Scanner;

public class Task5 {
    public static void run(Scanner scanner) {
        System.out.print("Введіть нижню границю діапазону результатів функції (A): ");
        double a = scanner.nextDouble();
        System.out.print("Введіть верхню границю діапазону результатів функції (B): ");
        double b = scanner.nextDouble();

        System.out.println("\n--- Розв'язок через цикл FOR ---");
        calculateWithFor(a, b);

        System.out.println("\n--- Розв'язок через цикл WHILE ---");
        calculateWithWhile(a, b);
    }

    private static void calculateWithFor(double a, double b) {
        int count = 0;
        // Проміжок [-2; 2], крок 0.2
        for (double x = -2.0; x <= 2.001; x += 0.2) {
            // Формула: f(x) = 2x * sin(x) - cos(x)
            double f = 2 * x * Math.sin(x) - Math.cos(x); 
            System.out.printf("x = %5.1f | f(x) = %.4f\n", x, f);
            if (f >= a && f <= b) count++;
        }
        printResult(count);
    }

    private static void calculateWithWhile(double a, double b) {
        int count = 0;
        double x = -2.0;
        // Проміжок [-2; 2], крок 0.2
        while (x <= 2.001) {
            // Формула: f(x) = 2x * sin(x) - cos(x)
            double f = 2 * x * Math.sin(x) - Math.cos(x);
            System.out.printf("x = %5.1f | f(x) = %.4f\n", x, f);
            if (f >= a && f <= b) count++;
            x += 0.2;
        }
        printResult(count);
    }

    private static void printResult(int count) {
        if (count > 0) {
            System.out.println("-> Кількість значень у заданому діапазоні: " + count);
        } else {
            System.out.println("-> Повідомлення: Значення функції у заданому діапазоні ВІДСУТНІ.");
        }
    }
}