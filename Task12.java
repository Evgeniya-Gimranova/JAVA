// Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class Task12 {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 6, -5, 7, 9, 3 };
        int minimal = minElement(array);
        int maximal = maxElement(array);
        System.out.println("Минимальный элемент " + minimal);
        System.out.println("Максимальный элемент " + maximal);
    }

    public static int minElement(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxElement(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
