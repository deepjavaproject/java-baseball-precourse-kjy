package baseball;

import baseball.controller.GameController;

public class Application {
    public static void main(String[] args) throws IllegalArgumentException{
        // TODO: 프로그램 구현
        GameController controller = new GameController();
        controller.gameStart();
    }

}
