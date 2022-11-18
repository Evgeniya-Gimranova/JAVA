// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = iScanner.nextLine();
        iScanner.close();
        System.out.println(palindromeCheck(s));  
    }
    public static boolean palindromeCheck(String str) {
        StringBuffer strName = new StringBuffer(str);
        strName.reverse();
    
        if (strName.toString().equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}