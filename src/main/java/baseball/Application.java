package baseball;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BaseballGame baseball = new BaseballGame();
        while(baseball.endCheck()){
            baseball.userInputNumber();
        }

    }
}
