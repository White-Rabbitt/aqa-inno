package newzoo.person;

import java.util.Random;
import java.util.Scanner;

public class Person {

    private String personPosition;
    private boolean isBite;
    private int bandageCount = 0;
    private int biteCount = 0;

    // конструктор
    public Person(String position) {
        personPosition = position;
    }

    // геттер
    public String getPersonPosition() {
        return personPosition;
    }

    public void setPersonPosition(String position) {
        personPosition = position;
    }

    // метод укуса персонала
    public void bitePerson() {
        var chanceToBite = new Random().nextInt(0, 100);
        if (chanceToBite > 50) {
            this.isBite = true;
            biteCount++;
            System.out.println("Вероятность укуса: " + chanceToBite + "%");
            System.out.println(personPosition + " был укушен");
            System.out.println("+++ необходимо наложить повязку +++");
            bandage();
        } else {
            this.isBite = false;
            System.out.println("Вероятность укуса: " + chanceToBite + "%");
            System.out.println("Животное не укусило. Продолжаем работу");
        }
    }

    // геттер статуса укуса
    public boolean getStatusBite() {
        return isBite;
    }

    // геттер получения количества укусов
    public int getBiteCount() {
        return biteCount;
    }

    // метод наложения повязки
    public void bandage() {
        isBite = false;
        bandageCount++;
        setPersonPosition("Ветеринар");
        System.out.println(personPosition + " наложил повязку. Можно возврашаться к работе");
    }

    // геттер количества наложенных повязок
    public int getBandageCount() {
        return bandageCount;
    }

    // метод ловли белки
    public void catchSquirrel() {
        boolean catchStatus = false;
        int catchCount = 1;
        while (catchStatus == false) {
            int chanceToCatch = new Random().nextInt(0, 100);
            if (chanceToCatch > 50) {
                System.out.println(catchCount + "-я попытка поймать белку Стрелку. Вероятность поимки: " + chanceToCatch + "%");
                System.out.println("Поймали! Можно возвращаться к работе");
                catchStatus = true;
            } else {
                System.out.println(catchCount + "-я попытка поймать белку Стрелку. Вероятность поимки: " + chanceToCatch + "%");
                System.out.println("Не поймали. Начинаем заново");
                catchStatus = false;
                catchCount++;
            }
        }
    }
}
