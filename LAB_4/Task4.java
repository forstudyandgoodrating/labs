public class Task4 {
    public static void run() {
        // Створюємо масив для перевірки
        int[] arr = {5, -4, 11, 20, -7, 8, 3, 14};

        System.out.println("--- Початковий масив ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Змінюємо знак непарних ЗНАЧЕНЬ масиву
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = -arr[i];
            }
        }

        System.out.println("--- Масив після зміни знаку всіх непарних елементів ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}