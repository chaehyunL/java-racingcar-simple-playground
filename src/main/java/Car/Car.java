package Car;

import java.util.Random;

public class Car {
    String name;
    int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }
    Random random= new Random();
    public void move() {

        int roll = random.nextInt(10);
        if (roll >= 4) {
            position++;
        }
    }
}
