package car;


public class Car {
    String color;
    String type;
    int year;

    public void start() {
        System.out.println("Автомобиль заведен");
    }

    public void stop() {
        System.out.println("Автомобиль заглушен");
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public Car() {

    }
}
