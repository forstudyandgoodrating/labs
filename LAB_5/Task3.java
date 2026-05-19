public class Task3 {
    // Метод приймає масив цілих чисел і виводить його елементи в консоль
    public static void printArray(int[] array) {
        System.out.print("Елементи масиву: [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}