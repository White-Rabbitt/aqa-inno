package Lesson08;

public class Task01 {
    public static void main(String[] args) {

        String str = "I like Java!!!";
        printText(str);

        /*
        Проверить, начинается ли ваша строка подстрокой “I like”.
        Используем метод String.startsWith()
         */
        System.out.println("Строка начинается с 'I like: ' " + str.startsWith("I like"));

        // Найти позицию подстроки “Java” в строке “I like Java!!!”
        System.out.println("Позиция подстроки 'Java': " + str.indexOf("Java"));

        // Заменить все символы “а” на “о”
        System.out.println("Заменить 'a' на 'o': " + str.replace("a", "o"));

        // Преобразуйте строку к верхнему регистру
        System.out.println("Верхний регистр: " + str.toUpperCase());

        // Преобразуйте строку к нижнему регистру
        System.out.println("Нижний регистр: " + str.toLowerCase());

        // Вырезать строку Java c помощью метода String.substring()
        String cutString = str.substring(str.indexOf("Java"));
        System.out.println("Вырезать строку: " + cutString.substring(0, cutString.indexOf("!")));
    }

    // Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    public static void printText(String str) {
        System.out.println(str);
    }
}