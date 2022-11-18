// Написать метод, которому в качестве параметра передается целое число, 
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int num = iScanner.nextInt();
        iScanner.close();
        ChekNum(num);
    }

    public static void ChekNum(int n) {
        if (n>=0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
}
