package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Game game = new Game();
        System.out.println("숫자 야구 게임을 시작합니다.");
        while (true) {
            game.playGame();
            if (reStartOrEnd()) {
                break;
            }
        }

    }

    public static boolean reStartOrEnd() {
        int inputNumber = Integer.parseInt(Console.readLine());

        return inputNumber == Constants.END_NUMBER;
    }
}
