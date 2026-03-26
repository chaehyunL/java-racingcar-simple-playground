package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    List<Car> cars = new ArrayList<>();


    public RacingGame(List<Car> newCars) {
        this.cars = newCars;

    }

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public void playRound() {
        for (Car car : cars) {
            car.move(randomNumberGenerator.generate());
        }
    }
    public List<Car> getCars(){
        return cars;
    }

}
