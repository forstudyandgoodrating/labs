import java.util.HashMap;

public class Task2 {
    public static void run() {
        // Створення HashMap для збереження пар "Прізвище" -> "Номер"
        HashMap<String, String> phoneBook = new HashMap<>();

        // 1. Операція put (додавання)
        phoneBook.put("Шевченко", "+380501112233");
        phoneBook.put("Франко", "+380671112233");
        phoneBook.put("Українка", "+380631112233");
        phoneBook.put("Сковорода", "+380991112233");
        phoneBook.put("Грушевський", "+380971112233");
        phoneBook.put("Коцюбинський", "+380961112233");
        phoneBook.put("Довженко", "+380502223344");
        phoneBook.put("Симоненко", "+380672223344");
        phoneBook.put("Стус", "+380632223344");
        phoneBook.put("Хмельницький", "+380992223344");

        // Виведення інформації з книги через цикл
        System.out.println("--- Список абонентів: ---");
        for (String lastName : phoneBook.keySet()) {
            System.out.println("Прізвище: " + lastName + " | Телефон: " + phoneBook.get(lastName));
        }

        // 2. Операції get та containsKey (пошук за прізвищем)
        System.out.println("\n--- Пошук номера: ---");
        String searchName = "Стус";
        if (phoneBook.containsKey(searchName)) {
            System.out.println("Номер абонента " + searchName + ": " + phoneBook.get(searchName));
        }

        String missingName = "Бандера";
        if (phoneBook.containsKey(missingName)) {
            System.out.println("Номер " + missingName + ": " + phoneBook.get(missingName));
        } else {
            System.out.println("У книзі відсутній такий абонент (" + missingName + ").");
        }

        // 3. Операція containsValue
        boolean hasNumber = phoneBook.containsValue("+380991112233");
        System.out.println("Чи є номер +380991112233 у базі? " + (hasNumber ? "Так" : "Ні"));

        // 4. Операція remove (видалення запису)
        System.out.println("\n--- Видалення запису: ---");
        phoneBook.remove("Франко");
        System.out.println("Абонента 'Франко' видалено.");

        // 5. Операція size
        System.out.println("Загальна кількість записів у книзі: " + phoneBook.size());
    }
}