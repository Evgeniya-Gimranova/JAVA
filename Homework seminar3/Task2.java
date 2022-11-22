// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList<Integer>();
        my_list.add(2);
        my_list.add(3);
        my_list.add(1);
        my_list.add(0);
        my_list.add(4);
        System.out.println(my_list);
        Collections.sort(my_list);
        int min = my_list.get(0);
        int max = my_list.get(my_list.size() - 1);
        double avg = average(my_list);
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
        System.out.println("Среднее арифметичнское " + avg);
    }

    static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

}
