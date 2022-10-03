package baseball.model;

import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Randoms;

public class BaseballNumberGenerator {
    private final int MIN_NUM = 1;
    private final int MAX_NUM = 9;
    private final static int MAX_SIZE = 3;

    ArrayList<Integer> baseballNumberList = new ArrayList<Integer>();

    public ArrayList<Integer> GetBaseballNubmer(){
        int start = 1;
        int end = 9;
        while(baseballNumberList.size() < MAX_SIZE){
            baseballNumberList.add(Randoms.pickNumberInRange( MIN_NUM, MAX_NUM));
        }

        return baseballNumberList;
    }



}
