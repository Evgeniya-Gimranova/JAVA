// Написать метод, которому в качестве параметра передается целое число. 
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int num = iScanner.nextInt();
        iScanner.close();
        System.out.println(checkNumber(num));
    }
    public static boolean checkNumber(int n){
        if (n < 0){
            return true;
        }
        else {
            return false;
        }
        }
}

