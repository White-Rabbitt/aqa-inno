package zooVersion2.person;

import zooVersion2.animal.Animal;

public class Vet extends Person {
    private int bandageCount = 0;

    public Vet() {
    }

    public void checkHealth(Animal animal) {
        System.out.println(getPosition() + " осматривает животное: " + animal.getType() + " " + animal.getName());
        if (!animal.getQuarantine() && !animal.getIsolation()) {
            System.out.println(animal.getName() + " здоров. Продолжаем осмотр");
        } else if (!animal.getQuarantine() && animal.getIsolation()) {
            animal.setQuarantine(true);
            System.out.println(animal.getName() + " болен и перемещен в изолятор");
        } else if (animal.getQuarantine() && animal.getIsolation()) {
            System.out.println(animal.getName() + " ещё болеет и остается в изоляторе");
        } else {
            animal.setQuarantine(false);
            System.out.println(animal.getName() + " выздоровел и помещен обратно в вольер");
        }

    }

    public void bandage(Person person) {
        if (person.getDamage()) {
            System.out.println(this.getPosition() + " сделал перевязку. Можно возвращаться к работе");
            this.bandageCount++;
        }
    }

    public int getBandageCount() {
        return this.bandageCount;
    }
}
