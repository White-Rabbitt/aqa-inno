package car;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Введите цвет автомобиля: ");
        String carColor = (new Scanner(System.in)).nextLine();

        System.out.println("Введите тип автомобиля: ");
        String carType = (new Scanner(System.in)).nextLine();

        System.out.println("Введите год выпуска: ");
        int carYear = (new Scanner(System.in)).nextInt();

        Car vehicle = new Car();
        vehicle.color = carColor;
        vehicle.type = carType;
        vehicle.year = carYear;

        System.out.println("Параметры автомобиля::");
        System.out.println("Цвет: " + vehicle.getColor());
        System.out.println("Тип кузова: " + vehicle.getType());
        System.out.println("Год выпуска: " + vehicle.getYear());
        System.out.println();

        vehicle.start();
        vehicle.stop();
    }
}

