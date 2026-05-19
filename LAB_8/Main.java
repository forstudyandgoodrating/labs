import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("======== ЛАБОРАТОРНА РОБОТА 8 ========");

        // 1. Перевірка наявності параметрів командного рядка
        if (args.length < 3) {
            System.out.println("Помилка! Будь ласка, передайте 3 аргументи командного рядка.");
            System.out.println("Формат: <ім'я_файлу.txt> <мінімальне_число> <максимальне_число>");
            return;
        }

        String fileName = args[0];
        int b1, b2;

        try {
            b1 = Integer.parseInt(args[1]);
            b2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Помилка! Межі діапазону повинні бути цілими числами.");
            return;
        }

        // Захист від переплутаних меж діапазону
        if (b1 > b2) {
            int temp = b1;
            b1 = b2;
            b2 = temp;
        }

        // 2. Робота з файлом (Клас File)
        File file = new File(fileName);

        try {
            // Перевірка існування файлу
            if (file.exists()) {
                System.out.println("Файл '" + fileName + "' вже існує. Дані будуть перезаписані.");
            } else {
                boolean isCreated = file.createNewFile();
                if (isCreated) {
                    System.out.println("Файл '" + fileName + "' успішно створено.");
                }
            }

            // 3. Запис у файл (FileWriter)
            FileWriter writer = new FileWriter(file);
            Random random = new Random();
            
            int count = 15; // Кількість чисел для генерації
            System.out.println("\nГенеруємо " + count + " випадкових чисел у діапазоні [" + b1 + ", " + b2 + "]...");

            for (int i = 0; i < count; i++) {
                // Використання заданої формули для генерації
                int randomNumber = random.nextInt(b2 - b1 + 1) + b1;
                writer.write(randomNumber + " ");
            }
            
            writer.close(); // Обов'язково закриваємо потік виводу
            System.out.println("Запис у файл завершено успішно!");

            // 4. Читання з файлу (FileReader)
            System.out.println("\n--- Читання даних з файлу '" + fileName + "' ---");
            FileReader reader = new FileReader(file);
            int character;
            
            // Читаємо посимвольно, поки метод read() не поверне -1 (кінець файлу)
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            
            reader.close(); // Обов'язково закриваємо потік вводу
            System.out.println("\n--- Кінець читання файлу ---");

        } catch (IOException e) {
            System.out.println("Сталася помилка вводу/виводу: " + e.getMessage());
        }
    }
}