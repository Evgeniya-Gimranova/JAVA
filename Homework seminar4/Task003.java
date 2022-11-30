// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.


import java.util.Collections;
import java.util.LinkedList;

public class Task003 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        LinkedList<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }
    public static <T> LinkedList<T> reverseList(LinkedList<T> list1) {
        LinkedList<T> reverse = new LinkedList<>(list1);
        Collections.reverse(reverse);
        return (LinkedList<T>) reverse;
    }
}
