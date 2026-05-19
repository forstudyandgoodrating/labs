public class Task2 {
    public static void run() {
        System.out.println("--- Годинник (цикл FOR) ---");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.println(h + " h " + m + " min");
            }
        }
    }
}