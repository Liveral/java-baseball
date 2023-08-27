package baseball;

import java.util.ArrayList;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    private static ArrayList<Integer> computerNumber;

    public Computer() {
        ArrayList<Integer> computer = new ArrayList<>();

        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);

            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        this.computerNumber = computer; //랜덤으로 만든 3자리 숫자를 return해준다.
    }

    public ArrayList<Integer> getComputerNumber() {
        return computerNumber;
    }
}
