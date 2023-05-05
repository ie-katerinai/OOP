package calculator;

public class LoggableFactory implements ICalculableFactory{

    private Loggable loggable;

    public LoggableFactory(ICalculableFactory calculableFactory) {
        this.loggable = new LoggerCalc();
    }

    @Override
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
