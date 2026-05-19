public class Task2 {
    public static void run() {
        int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("--- Перебір циклом WHILE ---");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

        System.out.println("\n\n--- Перебір циклом FOR ---");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println("\n\n--- WHILE (тільки непарні ІНДЕКСИ: 1, 3, 5...) ---");
        int k = 1;
        while (k < arr.length) {
            System.out.print("arr[" + k + "]=" + arr[k] + " ");
            k += 2;
        }

        System.out.println("\n\n--- FOR (тільки парні ІНДЕКСИ: 0, 2, 4...) ---");
        for (int m = 0; m < arr.length; m += 2) {
            System.out.print("arr[" + m + "]=" + arr[m] + " ");
        }

        System.out.println("\n\n--- Масив у зворотньому порядку ---");
        for (int p = arr.length - 1; p >= 0; p--) {
            System.out.print(arr[p] + " ");
        }
        System.out.println();
    }
}