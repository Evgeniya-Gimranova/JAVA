// Написать метод, который определяет, является ли год високосным, 
// и возвращает boolean (високосный - true, не високосный - false). 
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите год : ");
        int n = iScanner.nextInt();
        iScanner.close();
        System.out.println(leapYear(n));
    }
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}
