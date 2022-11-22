// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList<Integer>();
        my_list.add(2);
        my_list.add(7);
        my_list.add(8);
        my_list.add(3);
        my_list.add(5);
        my_list.add(12);
        my_list.add(9);
        my_list.add(21);
        my_list.add(15);
        my_list.add(6);
        System.out.println(my_list);

        my_list.removeIf(num -> num % 2 == 0);
        System.out.println(my_list);
    }
}