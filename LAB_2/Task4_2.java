import java.util.Scanner;

public class Task4_2 {
    public static void run(Scanner scanner) {
        System.out.println("Текстове меню (Варіант 18):");
        System.out.println("1 - Отримати привітання");
        System.out.println("2 - Запрошення до роботи на комп'ютері");
        System.out.println("3 - Завершити роботу");
        System.out.print("Оберіть пункт меню (1, 2 або 3): ");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Привіт! Бажаємо гарного дня та чудового настрою!");
                break;
            case 2:
                System.out.println("Запрошуємо вас розпочати плідну роботу за комп'ютером!");
                break;
            case 3:
                System.out.println("Завершення роботи... До зустрічі!");
                break;
            default:
                System.out.println("Помилка: Ви обрали неіснуючий пункт меню!");
                break;
        }
    }
}