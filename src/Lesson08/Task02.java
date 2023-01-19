package Lesson08;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        /*
        Необходимо написать программу конвертер физических величин. Пользователю
        сначала предлагается выбрать что переводить (масса или расстояние), затем
        предлагается выбрать единицу измерения. Далее пользователь должен ввести
        число. В результате программа должна вывести 4 строки с переведенными
        величинами.
         */

        System.out.println("Выберите, что переводить: \n[1] - масса \n[2] - расстояние");
        int parameter = new Scanner(System.in).nextInt();

        if (parameter == 1) {
            System.out.println("Введите единицу измерения: \n[1] - килограмм \n[2] - грамм \n[3] - фунт \n[4] - карат");
            int unitWeight = new Scanner(System.in).nextInt();
            if (unitWeight == 1 || unitWeight == 2 || unitWeight == 3 || unitWeight == 4) {
                System.out.println("Введите положительное число: ");
                double valueWeight = new Scanner(System.in).nextDouble();
                if (valueWeight > 0) {
                    calculateWeight(unitWeight, valueWeight);
                } else {
                    closeProgram(true);
                }
            } else {
                closeProgram(true);
            }

        } else if (parameter == 2) {
            System.out.println("Введите единицу измерения: \n[1] - метр \n[2] - миля \n[3] - ярд \n[4] - фут");
            int unitDist = new Scanner(System.in).nextInt();
            if (unitDist == 1 || unitDist == 2 || unitDist == 3 || unitDist == 4) {
                System.out.println("Введите положительное число: ");
                double valueDist = new Scanner(System.in).nextDouble();
                if (valueDist > 0) {
                    calculateDistance(unitDist, valueDist);
                } else {
                    closeProgram(false);
                }
            } else {
                closeProgram(false);
            }
        } else {
            closeProgram(false);
        }

    }

    public static void calculateWeight(int a, double weight) {

        switch (a) {
            case 1 -> System.out.println("Считаем килограммы. " + weight + " - это: \n" +
                    "Килограммы: " + weight + "\n" +
                    "Граммы:" + weight * 1000 + "\n" +
                    "Фунты: " + weight * 2.2046226218487757 + "\n" +
                    "Караты: " + weight * 5000);
            case 2 -> System.out.println("Считаем граммы. " + weight + " - это: \n" +
                    "Килограммы: " + weight / 1000 + "\n" +
                    "Граммы: " + weight + "\n" +
                    "Фунты: " + weight * 0.002204622621848776 + "\n" +
                    "Катары: " + weight * 5);
            case 3 -> System.out.println("Считаем фунты. " + weight + " - это: \n" +
                    "Килограммы: : " + weight * 0.45359237 + "\n" +
                    "Граммы: " + weight * 453.59237 + "\n" +
                    "Фунты: " + weight + "\n" +
                    "Караты: " + weight * 2267.96185);
            case 4 -> System.out.println("Считаем караты. " + weight + " - это: \n" +
                    "Килограммы: " + weight / 5000 + "\n" +
                    "Граммы: " + weight * 0.2 + "\n" +
                    "Фунты: " + weight / 2267.96185 + "\n" +
                    "Караты: " + weight);
        }
    }

    public static void calculateDistance(int a, double dist) {

        switch (a) {
            case 1 -> System.out.println("Считаем метры. " + dist + " - это: \n" +
                    "Метры: " + dist + "\n" +
                    "Мили:" + dist / 1609.347 + "\n" +
                    "Ярды: " + dist * 1.0936132983377078 + "\n" +
                    "Футы: " + dist * 3.280839895013123);
            case 2 -> System.out.println("Считаем мили. " + dist + " - это: \n" +
                    "Метры: " + dist * 1609.347 + "\n" +
                    "Мили:" + dist + "\n" +
                    "Ярды: " + dist * 1760.003280839895 + "\n" +
                    "Футы: " + dist * 5280.009842519685);
            case 3 -> System.out.println("Считаем ярды. " + dist + " - это: \n" +
                    "Метры: " + dist / 1.0936132983377078 + "\n" +
                    "Мили:" + dist / 1760.003280839895 + "\n" +
                    "Ярды: " + dist + "\n" +
                    "Футы: " + dist * 3);
            case 4 -> System.out.println("Считаем футы. " + dist + " - это: \n" +
                    "Метры: " + dist * 0.3048 + "\n" +
                    "Мили:" + dist / 5280.009842519685 + "\n" +
                    "Ярды: " + dist / 3 + "\n" +
                    "Футы: " + dist);
        }
    }

    public static void closeProgram(boolean exit) {
        System.out.println("Введено неверное значение");
        System.exit(1);
    }
}


