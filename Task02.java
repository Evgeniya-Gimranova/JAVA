
// Написать метод, принимающий на вход два целых числа и проверяющий, 
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int num1 = iScanner.nextInt();
        System.out.print("Введите второе число : ");
        int num2 = iScanner.nextInt();
        iScanner.close();
        Check(num1, num2);
    }

    public static void Check(int a, int b) {
        int s = a + b;
        if (s >= 10 && s <= 20)
            System.out.println("True");
        else {
            System.out.println("False");
        }
        ;
    }
}
