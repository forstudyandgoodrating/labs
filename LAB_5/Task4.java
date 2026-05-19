public class Task4 {
    // Метод приймає масив цілих чисел і повертає найбільше значення
    public static int getMaxFromArray(int[] array) {
        // Приймаємо перший елемент за максимальний
        int max = array[0]; 
        
        // Перебираємо масив, порівнюючи кожен елемент з поточним максимумом
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}