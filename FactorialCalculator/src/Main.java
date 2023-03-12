import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        System.out.println("!" + value + " = " + result);
    }
}