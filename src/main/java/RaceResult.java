import java.util.ArrayList;
import java.util.List;

public class RaceResult {
    private List<Car> cars;

    public RaceResult(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }
    public List<Car> getResult() {
        List<Car> resultCars = new ArrayList<>();
        int maxPosition=cars.stream()
                .mapToInt(Car::getPosition).max()
                .orElse(0);
        resultCars=cars.stream().filter(car->car.getPosition()==maxPosition)
                .toList();
        return resultCars;
    }

}
