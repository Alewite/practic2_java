import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        boolean found = false;

        while (n > 0) {
            if (n % 10 == 2) {
                found = true;
            }
            n = n / 10;
        }

        System.out.println(found);
    }
}