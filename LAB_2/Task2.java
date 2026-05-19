import java.util.Scanner;

public class Task2 {
    public static void run(Scanner scanner) {
        System.out.println("Введіть координати точки (x та y):");
        System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("y = ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться у I квадранті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться у II квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться у III квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться у IV квадранті.");
        } else if (x == 0 && y != 0) {
            System.out.println("Точка лежить на осі Y.");
        } else if (y == 0 && x != 0) {
            System.out.println("Точка лежить на осі X.");
        } else {
            System.out.println("Точка знаходиться в початку координат (0, 0).");
        }
    }
}