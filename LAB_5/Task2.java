public class Task2 {
    // Метод приймає три числа, виводить найменше в консоль і повертає його
    public static double getMinOfThree(double a, double b, double c) {
        // Використовуємо вбудований метод Math.min для знаходження мінімуму
        double min = Math.min(a, Math.min(b, c));
        System.out.println("Найменше число серед " + a + ", " + b + " та " + c + " дорівнює: " + min);
        return min;
    }
}