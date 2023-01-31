package newzoo.animal;

public class Hippo extends Animal {

    // конструктор
    public Hippo(String name) {
        super(name);
    }

    private int hippoIsFed = 0; // количество корплений бегемота
    private int water = 0; // счётчик замены воды

    // геттер/сеттер количества кормлений бегемота
    public int getHippoIsFed() {
        return hippoIsFed;
    }
    public void setHippoIsFed() {
        hippoIsFed++;
    }

    // метод замены воды
    public void changeWater() {
        water++;
        System.out.println(" поменял воду в бассейне");
    }

    // геттер количеста замен воды
    public int getWater() {
        return water;
    }


}
