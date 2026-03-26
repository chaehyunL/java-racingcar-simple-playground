
import model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CarTest {
    @Test
    @DisplayName("Car이름을 A로 설정하면_이름이 A로 호출된다")
    public void Test_getName() {
        Car car = new Car("A");
        Assertions.assertEquals("A", car.getName());
    }

    @Test
    @DisplayName("자동차가 0-3 사이 값이 나오면 정지함.")
    public void Test_underForwardThreshold() {
        Car car = new Car("A");
        car.move(3);
        Assertions.assertEquals(0, car.getPosition());
    }

    @Test
    @DisplayName("자동차가 4-9사이의 값이 나오면 전진함.")
    public void Test_overForwardThreshold() {
        Car car = new Car("A");
        car.move(4);
        Assertions.assertEquals(1, car.getPosition());
    }
}
