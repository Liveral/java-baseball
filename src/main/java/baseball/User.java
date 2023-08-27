package baseball;

import java.util.ArrayList;

import camp.nextstep.edu.missionutils.Console;

public class User {
    private static ArrayList<Integer> userNumber;

    public User() {
        userNumber = new ArrayList<>();
    }

    public void setUserNumber() {
        ArrayList<Integer> user = new ArrayList<>();

        String input = Console.readLine();
        for (int i = 0; i < Constants.NUMBER_LENGTH; i++) {
            user.add(input.charAt(i) - '0');  //입력받은 문자열을 하나씩 끊어서 리스트에 저장
        }

        this.userNumber = user;
    }

    public ArrayList<Integer> getUserNumber() {
        return userNumber;
    }

    public int getUserNumberIdx(int idx) {
        return userNumber.get(idx);
    }
}
