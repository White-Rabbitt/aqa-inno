import java.util.Arrays;
import java.util.Scanner;

public class Lesson02 {
    public static void main(String[] args) {
        task01();
        task02();
        task03();
        task04();
        task05();
    }

    public static void task01() {

        /*
        Task01
        Составить программу, которая уменьшает первое введенное число в два раза,
        если оно больше второго введенного числа по абсолютной величине.
         */

        System.out.println("Задача 1");
        System.out.println("Введите первое число: ");
        var a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число: ");
        var b = new Scanner(System.in).nextDouble();

        if (Math.abs(a) > b) {
            a /= 2;
            System.out.println("a = " + a);
        } else if (Math.abs(a) < b) {
            System.out.println("a = " + a + "\n" + "b = " + b);
        } else {
            System.out.println("Числа равны");
        }
        System.out.println();
    }

    public static void task02() {

        /*
        Task02
        Напечатать числа с помощью цикла for следующим образом:
        10 10.4
        11 11.4
        ...
        25 25.4
        */

        System.out.println("Задача 2");
        System.out.println("Введите начальное число: ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Введите конечное число: ");
        var b = new Scanner(System.in).nextInt();
        Double c = .0;

        if (a != b) {
            for (int i = a; i <= b; i++) {
                c = Double.valueOf(a) + 0.4;
                System.out.println(a + "\t" + c);
                a++;
            }
        } else {
            System.out.println("Не указан диапазон чисел");
        }
        System.out.println();
    }

    public static void task03() {

        /*
        Task03
        Найти максимальное из натуральных чисел, не превышающих 5000,
        которое нацело делится на 39. Используйте цикл с пост- или предусловием
         */

        // префикс + while
        var temp = 0;
        int i = 1;
        while (i <= 5000) {
            i++;
            if (i % 39 == 0) {
                temp = i;
            }
        }
        System.out.println("Задача 3");
        System.out.println("Префикс / " + temp);

        // постфикс + do while
        var temp2 = 0;
        int j = 0;
        do {
            ++j;
            if (j % 39 == 0) {
                temp2 = j;
            }
        }
        while (j <= 5000);
        System.out.println("Постфикс / " + temp2);
        System.out.println();
    }

    public static void task04() {

        /*
        Task04
        Заполнить массив из десяти элементов значениями,
        вводимыми с клавиатуры в ходе выполнения программы.
        */

        System.out.println("Задача 4");
        int[] arrayInt = new int[10];
        System.out.println("Введите 10 чисел: ");
        for (int i = 0; i < 10; i++) {
            arrayInt[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(Arrays.toString(arrayInt));
        System.out.println();
    }

    public static void task05() {

        /*
        Task05
        Гражданин 1 марта открыл счет в банке, вложив 1000 руб.
        Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы.
        Определить:
        1. за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
        2. через сколько месяцев размер вклада превысит 1200 руб.
        */

        Double startDeposit = 1000.;
        Double forMonthDeposit = startDeposit;
        Double percentMonth = 0.;
        var countMonth = 0;
        var month = 0;

        Double calculateDeposit = startDeposit;
        Double limitDeposit = 1200.;
        Double percent = 0.;

        while (percentMonth <= 30) {
            percentMonth = forMonthDeposit / 100 * 2;
            forMonthDeposit = forMonthDeposit + percentMonth;
            month++;
        }
        System.out.println("Задача 5");
        System.out.println("Месяц, за который ежемесячный вклад превысит 30 рублей: " + month);

        while (calculateDeposit <= limitDeposit) {
            percent = calculateDeposit * 0.02;
            calculateDeposit += percent;
            countMonth++;
        }
        System.out.println("Величина вклада превысит 1200 руб через " + countMonth + " месяцев");
    }
}
