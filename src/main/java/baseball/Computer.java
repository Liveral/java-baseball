package baseball;

import java.util.ArrayList;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {

    public static ArrayList<Integer> setRandomNumber() {

        ArrayList<Integer> randomNumberList = new ArrayList<>();
        while (randomNumberList.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumberList.contains(randomNumber)){
                randomNumberList.add(randomNumber);
            }
        }

        return randomNumberList; //랜덤으로 만든 3자리 숫자를 return해준다.
    }
}
