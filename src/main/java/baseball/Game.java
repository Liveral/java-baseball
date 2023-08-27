package baseball;

public class Game {

    private static Computer computerNumbers = new Computer();
    private static User userNumbers = new User();
    private static int strike;
    private static int ball;

    public void playGame() {
        computerNumbers.setComputerNumber();

        while (true) {
            strike = 0;
            ball = 0;

            userNumbers.setUserNumber();
            getStrikeAndBall();
            printResult();

            if (strike == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
            }
        }
    }

    public static void getStrikeAndBall() { //스트라이크인지 체크하고, 아니면 볼인지 체크한다.
        for (int i = 0; i < Constants.NUMBER_LENGTH; i++) {
            //컴퓨터와 사용자의 3자리 숫자를 각 자릿수 별로 같은 자리에 같은 숫자가 있는지 확인하고, 있으면 스트라이크 없으면 볼 체크 함수를 불러온다.
            if (computerNumbers.getComputerNumberIdx(i) == userNumbers.getUserNumberIdx(i)) {
                strike++;
            } else {
                getBall(i);
            }
        }
    }

    public static void getBall(int idx) {
        //컴퓨터 숫자 리스트에 매개변수로 받은 인덱스번째에 있는 사용자의 숫자가 포함되어 있으면 볼
        if (computerNumbers.getComputerNumber().contains(userNumbers.getUserNumberIdx(idx))) {
            ball++;
        }
    }

    public static void printResult() { //매개변수로 받은 스트라이크와 볼의 수에 따라 출력이 달라진다.
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (strike == 0) {
            System.out.printf("%d볼\n", ball);
        } else if (ball == 0) {
            System.out.printf("%d스트라이크\n", strike);
        } else {
            System.out.printf("%d볼 %d스트라이크\n", ball, strike);
        }
    }
}

