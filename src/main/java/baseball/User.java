package baseball;

import java.util.ArrayList;

import camp.nextstep.edu.missionutils.Console;

public abstract class User {
    private static ArrayList<Integer> userNumber;

    public User() {
        userNumber = new ArrayList<>();
    }

    public void setUserNumber(ArrayList<Integer> imputNumber) {
        ArrayList<Integer> user = new ArrayList<>();

        String input = Console.readLine();
        for (int i = 0; i < 3; i++) {
            user.add(input.charAt(i) - '0');  //입력받은 문자열을 하나씩 끊어서 리스트에 저장
        }

        this.userNumber = imputNumber;
    }

    public static ArrayList<Integer> getUserNumber() {
        
        return userNumber;
    }
}
