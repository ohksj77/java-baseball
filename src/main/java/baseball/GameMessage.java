package baseball;

public enum GameMessage {
    GAME_START("숫자 야구 게임을 시작합니다."),
    INPUT_NEXT_NUMBER("숫자를 입력해주세요 : "),
    GAME_FINISH("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    CREATE_NEW_GAME_OR_NOT("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
    ;
    private final String message;

    GameMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
