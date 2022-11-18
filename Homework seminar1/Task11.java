// Написать метод, принимающий на вход два аргумента: len и initialValue, 
// и возвращающий одномерный массив типа int длиной len, 
// каждая ячейка которого равна initialValue;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int length = iScanner.nextInt();
        System.out.print("Введите второе число : ");
        int initValue = iScanner.nextInt();
        createArray(length, initValue);
        iScanner.close();

        
    }
    public static void createArray(int len,int initialValue ) {
        int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + arr[i] + " " + "]");
            }
    }
        
    }

