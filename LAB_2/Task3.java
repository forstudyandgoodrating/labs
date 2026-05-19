import java.util.Scanner;

public class Task3 {
    public static void run(Scanner scanner) {
        System.out.print("Введіть ціле число для перевірки: ");
        int number = scanner.nextInt();

        boolean isTwoDigit = Math.abs(number) >= 10 && Math.abs(number) <= 99;
        boolean isEven = number % 2 == 0;

        if (isTwoDigit && isEven) {
            System.out.println("Число " + number + " Є двозначним І парним.");
        } else {
            System.out.println("Число " + number + " НЕ задовольняє умови (не є одночасно двозначним і парним).");
            if (!isTwoDigit) System.out.println("- Воно не двозначне.");
            if (!isEven) System.out.println("- Воно не парне.");
        }
    }
}