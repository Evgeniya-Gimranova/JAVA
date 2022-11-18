// Написать метод, которому в качестве аргументов передается строка и число, 
// метод должен отпечатать в консоль указанную строку, 
// указанное количество раз;

public class Task05 {
    public static void main(String[] args) {
        String string = "Hello world";
        int num = 5;
        printString(string, num);
    }

    public static void printString(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + str);
        }
    }
}