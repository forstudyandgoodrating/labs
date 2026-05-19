import java.util.Scanner;

public class Task4_1 {
    public static void run(Scanner scanner) {
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();
        double f;

        if (x < -0.5) {
            // f(x) = sin(x) - 1/2 * cos^3(|x|)
            f = Math.sin(x) - 0.5 * Math.pow(Math.cos(Math.abs(x)), 3);
        } else if (x >= -0.5 && x <= 1) {
            // f(x) = log_2(|1 - x|). В Java логарифм за основою 2 рахується через натуральні логарифми: ln(a) / ln(2)
            f = Math.log(Math.abs(1 - x)) / Math.log(2);
        } else {
            // f(x) = |sin(x^2)|
            f = Math.abs(Math.sin(x * x));
        }

        System.out.printf("Значення функції F(x) = %.4f\n", f);
    }
}