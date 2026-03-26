package controller;

import view.*;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void run() {
        String input = InputView.getCarNames();
        String[] carNames = input.split(",");
        int number = InputView.getTrynumber();

        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name.trim()));
        }
        RacingGame racingGame= new RacingGame(cars);

        OutputView.getOutput();
        while(number>0){
            racingGame.playRound();
            OutputView.printRace(cars);
            number--;
        }
        RaceResult raceResult=new RaceResult(cars);
        OutputView.printWinners(raceResult.getResult());
    }
}
