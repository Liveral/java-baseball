package baseball;

import java.util.ArrayList;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    private static ArrayList<Integer> computerNumber;

    public Computer() {
    }

    public void setComputerNumber() {
        ArrayList<Integer> computer = new ArrayList<>();

        while (computer.size() < Constants.NUMBER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);

            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        this.computerNumber = computer; //랜덤 3자리 숫자를 생성한다.
    }

    public ArrayList<Integer> getComputerNumber() {
        return computerNumber;
    }

    public int getComputerNumberIdx(int idx) { //특정 인덱스의 숫자를 리턴하는 함수
        return computerNumber.get(idx);
    }

}
