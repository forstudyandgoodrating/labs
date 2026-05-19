public class Main {
    public static void main(String[] args) {
        System.out.println("======== ЗАВДАННЯ 1 ========");
        double d1 = 10.5;
        double d2 = 8.0;
        double rhombusArea = Task1.calculateRhombusArea(d1, d2);
        System.out.println("Площа ромба з діагоналями " + d1 + " і " + d2 + " дорівнює: " + rhombusArea);

        System.out.println("\n======== ЗАВДАННЯ 2 ========");
        // Викликаємо метод, який сам виведе інформацію і поверне значення
        double minResult = Task2.getMinOfThree(15.4, 8.9, 22.1);

        System.out.println("\n======== ЗАВДАННЯ 3 ========");
        int[] myNumbers = {4, 17, -5, 33, 10, 0, 8};
        // Викликаємо метод для виведення масиву
        Task3.printArray(myNumbers);

        System.out.println("\n======== ЗАВДАННЯ 4 ========");
        int maxResult = Task4.getMaxFromArray(myNumbers);
        System.out.println("Найбільше число у переданому масиві: " + maxResult);
    }
}