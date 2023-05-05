package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;
    private CCalculableFactory complexCalcFactory;
    private Loggable loggable = new LoggerCalc();

    public ViewCalculator(ICalculableFactory calculableFactory, CCalculableFactory complexCalcFactory) {
        this.calculableFactory = calculableFactory;
        this.complexCalcFactory = complexCalcFactory;
    }

    public void run() {
        int operation = 1;
        while (operation == 1 || operation == 2) {
            operation = promptInt("Выбирите тип числа: 1 - целые или 2 - комплексные, 0 - завершить программу: ");
            switch (operation) {
                case 1: {
                    int primaryArg = promptInt("Введите первый аргумент: ");
                    Calculable calculator = calculableFactory.create(primaryArg);
                    loggable.saveLog("Первый аргумент " + primaryArg);
                    while (true) {
                        String cmd = prompt("Введите команду (*, +, =) : ");
                        if (cmd.equals("*")) {
                            int arg = promptInt("Введите второй аргумент: ");
                            loggable.saveLog("Второй аргумент " + arg + ", операция умножения.");
                            calculator.multi(arg);
                            continue;
                        }
                        if (cmd.equals("+")) {
                            int arg = promptInt("Введите второй аргумент: ");
                            loggable.saveLog("Второй аргумент " + arg + ", операция сложения.");
                            calculator.sum(arg);
                            continue;
                        }
                        if (cmd.equals("=")) {
                            int result = calculator.getResult();
                            System.out.printf("Результат: %d\n", result);
                            loggable.saveLog("Результат: " + result);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    double re = promptDouble("Введите действительную часть: ");
                    double im = promptDouble("Введите мнимую часть: ");
                    Complex complexArg = new Complex(re, im);
                    ComplexCalculable complexCalc = complexCalcFactory.create(complexArg);
                    loggable.saveLog("Комплексное число: " + complexArg.toString());
                    while (true) {
                        String cmd = prompt("Введите команду (*, +, =) : ");
                        if (cmd.equals("*")) {
                            double re2 = promptDouble("Введите действительную часть: ");
                            double im2 = promptDouble("Введите мнимую часть: ");
                            Complex arg = new Complex(re2, im2);
                            loggable.saveLog("Комплексное число: " + arg.toString() + ", операция умножения.");
                            complexCalc.multi(arg);
                            continue;
                        }
                        if (cmd.equals("+")) {
                            double re2 = promptDouble("Введите действительную часть: ");
                            double im2 = promptDouble("Введите мнимую часть: ");
                            Complex arg = new Complex(re2, im2);
                            loggable.saveLog("Комплексное число: " + arg.toString() + ", операция сложения.");
                            complexCalc.sum(arg);
                            continue;
                        }
                        if (cmd.equals("=")) {
                            Complex result = complexCalc.getResult();
                            if (result != null) {
                                System.out.println("Результат: " + result.toString());
                                loggable.saveLog("Результат: " + result.toString());
                            } else {
                                System.out.println("Не введен второй аргумент.");
                            }
                            break;
                        }
                    }
                }
            }
        }
        loggable.saveLog("Завершение программы.");
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
