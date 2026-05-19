import java.util.Scanner;

public class Task3 {
    public static void run(Scanner scanner) {
        System.out.print("Введіть розмірність масиву (n): ");
        int n = scanner.nextInt();

        double[] realArray = new double[n];
        double sum = 0;

        System.out.println("Введіть " + n + " дійсних елементів масиву (через кому або крапку): ");
        for (int i = 0; i < n; i++) {
            realArray[i] = scanner.nextDouble();
            sum += realArray[i]; // Одразу додаємо до суми
        }

        System.out.println("-> Сума всіх елементів масиву: " + sum);
    }
}