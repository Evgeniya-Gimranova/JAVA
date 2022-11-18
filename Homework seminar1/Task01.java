
/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 */
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число n : ");
        int n = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + triangle(n) + "\n");
        System.out.printf("Произведение чисел от 1 до n" + "\n" + getFactorial(n) + "\n");
    }

    public static int triangle(int num) {
        int total = 0;
        for (int index = 0; index < num + 1; index++) {
            total = total + index;
        }
        return total;
    }

    public static int getFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}