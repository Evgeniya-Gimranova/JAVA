// Написать метод, который принимает массив элементов,
// помещает их в очередь и выводит на консоль содержимое очереди.
import java.util.ArrayDeque;
import java.util.Queue;

public class Task002 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
    }
}
