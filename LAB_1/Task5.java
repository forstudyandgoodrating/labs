public class Task5 {
    public static void run() {
        int number = 412;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        int reversed = (units * 100) + (tens * 10) + hundreds;
        
        System.out.printf("Початкове число: %d => Перевернуте число: %d\n", number, reversed);
    }
}