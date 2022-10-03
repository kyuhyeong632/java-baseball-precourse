package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BaseballGame {

    private ArrayList<Integer> comNumber;
    private ArrayList<Integer> userNumber;
    private final int MAX_SIZE = 3;
    private final int START_NUM = 1;
    private final int END_NUM = 9;
    private int ball = 0;
    private int strike = 0;


    public ArrayList<Integer> baseballNumber(){
        while (comNumber.size() < MAX_SIZE){
            comNumber.add(Randoms.pickNumberInRange(START_NUM, END_NUM));
        }

        return comNumber;

    }

    public void userInputNumber(){
        System.out.println("숫자를 입력해 주세요");
        String intputNum = Console.readLine();
        makeUserNumber(intputNum);
        checkUserInput();
        compareNumbers();

    }
    public ArrayList<Integer> makeUserNumber(String inNum){
        String[] inArr = inNum.split("");
        for(int i = 0; i<inArr.length; i++){
            userNumber.add(Integer.parseInt(inArr[i]));
        }
        return userNumber;
    }

    public void checkUserInput(){
        if(userNumber.size() != MAX_SIZE){
            throw new IllegalArgumentException("3자리 숫자를 입력해주세요");
        }
        if(userNumber.contains(0)){
            throw new IllegalArgumentException("0을 제외한 숫자를 입력해주세요");
        }
        Set<Integer> tmpSet = new HashSet<>(userNumber);
        if(userNumber.size() != tmpSet.size()){
            throw new IllegalArgumentException("중복된 숫자가 있습니다. 다시 입력해주세요");
        }

    }

    public void compareNumbers(){
        this.ball = 0;
        this.strike = 0;
        for(int i = 0; i<userNumber.size(); i++){
            if(comNumber.indexOf(userNumber.get(i))==i){
                strike++;
                continue;
            }
            if(comNumber.contains(userNumber.get(i))){
                ball++;
            }

        }

    }



}
