package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class BaseballGame {

    private ArrayList<Integer> comNumber;
    private final int MAX_SIZE = 3;
    private final int START_NUM = 1;
    private final int END_NUM = 9;


    public ArrayList<Integer> baseballNumber(){
        while (comNumber.size() < MAX_SIZE){
            comNumber.add(Randoms.pickNumberInRange(START_NUM, END_NUM));
        }

        return comNumber;

    }

}
