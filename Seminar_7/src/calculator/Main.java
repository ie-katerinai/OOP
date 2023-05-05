package calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory loggableFactory = new LoggableFactory(calculableFactory);
        CCalculableFactory complexFactory = new ComplexCalcFactory();
        ViewCalculator view = new ViewCalculator(loggableFactory, complexFactory);
        view.run();
    }
}
