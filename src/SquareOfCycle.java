import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareOfCycle {

    public static void main(String[] args) {

        // Найти значение S = π × r2, если введен радиус
        int radius;
        double square;
        boolean condition = true;
        while (condition) {
            try {
                radius = new Scanner(System.in).nextInt();
                square = Math.PI * Math.pow(radius, 2);
                System.out.println("Площадь круга = " + square);
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Введено не число");
            }
        }


        // Альтернативное решение
        Scanner sc = new Scanner(System.in);
        int r;
        double s;
        while (true) {
            String str = sc.nextLine();
            try {
                r = Integer.parseInt(str);
                s = Math.PI * Math.pow(r, 2);
                System.out.println("Площадь круга = " + s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введено не число");
            }
        }
    }
}
