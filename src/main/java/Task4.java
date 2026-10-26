import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите A: ");
        double a = scanner.nextDouble();

        double res = calculate(a);

        System.out.println("Ответ: " + res);
    }

    public static double calculate(double a) {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a6 = a4 * a2;

        return a2 + a4 + a6;
    }
}