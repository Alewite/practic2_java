import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите X: ");
        double x = scanner.nextDouble();

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        double sum = 1;
        double p = 1;

        for (int i = 1; i <= n; i++) {
            p = p * x / i;
            sum = sum + p;
        }

        System.out.println("Ответ: " + sum);
    }
}