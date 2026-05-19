import java.util.Scanner;

public class Task1 {
    public static void run(Scanner scanner) {
        System.out.println("Введіть коефіцієнти a, b, c для рівняння ax^2 + bx + c = 0:");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Помилка: Це не квадратне рівняння (a = 0).");
            return;
        }

        double d = b * b - 4 * a * c;
        System.out.println("Дискримінант D = " + d);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("Рівняння має два корені: x1 = %.2f, x2 = %.2f\n", x1, x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.printf("Рівняння має один корінь: x = %.2f\n", x);
        } else {
            System.out.println("Рівняння не має дійсних коренів (D < 0).");
        }
    }
}