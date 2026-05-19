public class Task1 {
    public static void run() {
        // Створюємо пусті масиви
        int[] evenNumbers = new int[50];
        int[] oddNumbers = new int[50];

        // Заповнюємо масиви
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = i * 2;           // Парні: 0, 2, 4...
            oddNumbers[i] = i * 2 + 1;        // Непарні: 1, 3, 5...
        }

        // Вивід парних чисел
        System.out.println("--- 50 парних чисел ---");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Вивід непарних чисел
        System.out.println("\n--- 50 непарних чисел ---");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
    }
}