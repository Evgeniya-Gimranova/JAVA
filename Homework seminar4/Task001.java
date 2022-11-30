
// Написать метод, который принимает массив элементов, 
// помещает их в стэк и выводит на консоль содержимое стэка.

import java.util.LinkedList;

public class Task001 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);
        System.out.println(stack);
    }
}