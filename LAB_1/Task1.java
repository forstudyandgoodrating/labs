public class Task1 {
    public static void run() {
        int v1 = 10, v2 = 20, v3 = 30, v4 = 40, v5 = 50, v6 = 60, v7 = 70, v8 = 80, v9 = 90, v10 = 100;
        
        long sum = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10;
        int sub = v1 - v2 - v3 - v4 - v5 - v6 - v7 - v8 - v9 - v10;
        long mult = (long) v1 * v2 * v3 * v4 * v5 * v6 * v7 * v8 * v9 * v10;
        int div = v10 / v1;

        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + sub);
        System.out.println("Добуток: " + mult);
        System.out.println("Частка (v10/v1): " + div);
    }
}