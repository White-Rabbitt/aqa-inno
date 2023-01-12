import java.time.Year;
import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {
        task01();
        task02();
        task03();
    }

    public static void task01() {

        /*
        Task 01
        С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот
        период? А месяцев? Выведите полученные значения в консоль.
        */

        //System.out.println("Введите количество дней: ");
        //int days = new Scanner(System.in).nextInt();
        int days = 234;
        int fullWeeks = 234 / 7;
        int fullMonth = 234 / 31;
        System.out.println("Количество дней: " + days);
        System.out.println("Количетсво полных недель = " + fullWeeks);
        System.out.println("Количество полных месяцев = " + fullMonth);

        System.out.println();
    }

    public static void task02() {

        /*
        Task 02
        Дано двузначное число 57. Найти:
        a. число десятков в нем;
        b. число единиц в нем;
        c. сумму его цифр;
        d. произведение его цифр.
        Выведите все полученные значения в консоль
        */

//        System.out.println("Введите двузначное число: ");
//        int num = new Scanner(System.in).nextInt();
        int num = 57;
        int a = num / 10;
        int b = num % 10;
        int c = a + b;
        int d = a * b;
        System.out.println("Введённое число: " + num);
        System.out.println("Число десятков = " + a);
        System.out.println("Число единиц = " + b);
        System.out.println("Сумма цифр = " + c);
        System.out.println("Произведение цифр = " + d);

        System.out.println();

    }

    public static void task03() {

        /*
        Task 03
        Найдите возраст человека, если известно, что год его рождения 1991.
        Выведите полученный результат в виде “Возраст = …”
        */

//        System.out.println("Введите год рождения: ");
//        int birthYear = new Scanner(System.in).nextInt();
        int birthYear = 1991;
        int year = Year.now().getValue();
        int age = year - birthYear;
        System.out.println("Год рождения: " + birthYear);
        System.out.println("Возраст = " + age);
    }
}

