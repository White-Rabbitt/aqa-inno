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
        return this.color;
    }

    public String getType() {
        return this.type;
    }

    public int getYear() {
        return this.year;
    }

    public Car() {
    }
}
