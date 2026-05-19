import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======== ЗАВДАННЯ 1 ========");
        Task1.run();

        System.out.println("\n======== ЗАВДАННЯ 2 ========");
        Task2.run();

        System.out.println("\n======== ЗАВДАННЯ 3 ========");
        Task3.run(scanner);

        System.out.println("\n======== ЗАВДАННЯ 4 ========");
        Task4.run();

        scanner.close();
        System.out.println("\nВсі завдання успішно виконано!");
    }
}