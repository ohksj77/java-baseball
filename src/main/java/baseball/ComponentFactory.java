package baseball;

public class ComponentFactory {

    public BaseballController baseballController() {
        return new BaseballController(
                baseballService(),
                userAttemptValidator(),
                outputWriter(),
                inputReader());
    }

    private InputReader inputReader() {
        return new InputReader();
    }

    private OutputWriter outputWriter() {
        return new OutputWriter();
    }

    private BaseballService baseballService() {
        return new BaseballService(baseballRepository());
    }

    private BaseballRepository baseballRepository() {
        return new BaseballRepository();
    }

    private InputValidator userAttemptValidator() {
        return new InputValidator();
    }
}
