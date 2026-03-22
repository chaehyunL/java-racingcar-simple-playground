import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String value = scanner.nextLine();
        System.out.println("시도할 횟수는 몇회인가요?");
        int number = scanner.nextInt();
        String[] carNames=value.split(",");

        List<Car> cars=new ArrayList<>();
        for(String name:carNames){
            cars.add(new Car(name.trim()));
        }
        System.out.println("실행 결과");
        RacingGame racingGame=new RacingGame(cars,number);
        racingGame.playGame();
    }
}

