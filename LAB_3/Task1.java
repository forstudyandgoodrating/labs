public class Task1 {
    public static void run() {
        String phrase = "Я успішно вивчаю програмування на Java!";
        
        System.out.println("--- Вивід 50 разів через цикл FOR ---");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + phrase);
        }

        System.out.println("\n--- Вивід 50 разів через цикл WHILE ---");
        int j = 1;
        while (j <= 50) {
            System.out.println(j + ". " + phrase);
            j++;
        }
    }
}