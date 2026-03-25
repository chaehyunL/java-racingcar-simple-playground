package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    List<Car> cars = new ArrayList<>();
    int count;

    public RacingGame(List<Car> newCars, int newcount) {
        this.cars = newCars;
        this.count = newcount;
    }

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public void moveCars() {
        for (Car car : cars) {
            car.move(randomNumberGenerator.generate());
        }
    }
    public void playRound(){
        moveCars();
    }
    public List<Car> getCars(){
        return cars;
    }
    public List<Car> getWinners(){
        RaceResult raceResult= new RaceResult(cars);
        return raceResult.getResult();
    }
}
