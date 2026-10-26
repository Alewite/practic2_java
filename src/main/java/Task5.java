
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nГлавное меню:");
            System.out.println("1. Выполнить расчет");
            System.out.println("2. Информация о программе");
            System.out.println("3. Информация о разработчике");
            System.out.println("4. Выход");
            System.out.print("Выберите пункт: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите число от 1 до 4 ");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 1) {
                calculate(scanner);
            } else if (choice == 2) {
                about();
            } else if (choice == 3) {
                developer();
            } else if (choice == 4) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Ошибка! Такого пункта нет.");
            }
        }
    }

    public static void calculate(Scanner scanner) {
        while (true) {
            System.out.print("Введите радиус круга (0 - назад): ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
                continue;
            }

            double r = scanner.nextDouble();

            if (r == 0) {
                return;
            }

            if (r < 0) {
                System.out.println("Ошибка! Радиус должен быть больше 0.");
                continue;
            }

            double s = Math.PI * r * r;

            System.out.println("Площадь круга = " + s);
            return;
        }
    }

    public static void about() {
        System.out.println("Программа вычисляет площадь круга.");
        System.out.println("Формула: S = PI * r^2");
    }

    public static void developer() {
        System.out.println("Разработчик: Alewite");
    }
}
