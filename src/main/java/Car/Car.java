package Car;

public class Car {
    String name;
    int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move() {
        int roll = (int) (Math.random() * 10);
        if (roll >= 4) {
            position++;
        }
    }
}
