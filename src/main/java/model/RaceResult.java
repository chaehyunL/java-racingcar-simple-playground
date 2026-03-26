package model;

import java.util.ArrayList;
import java.util.List;

public class RaceResult {
    private final List<Car> cars;

    public RaceResult(List<Car> newCars) {
        this.cars = new ArrayList<>(newCars);
    }

    public int getMaxposition(){
        int maxPosition=cars.stream().
                mapToInt(Car::getPosition).max()
                .orElse(0);
        return maxPosition;
    }
    public List<Car> getResult() {
        List<Car> resultCars = new ArrayList<>();
        int maxPosition = getMaxposition();
        resultCars = cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .toList();
        return resultCars;
    }

}
