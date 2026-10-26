import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int N = scanner.nextInt();

        double y = 0;

        for (int n = 2; n <= N; n++) {
            y = y + 1.0 / (n * n - 1);
        }

        System.out.println("Ответ: " + y);
    }
}