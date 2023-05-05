package calculator;

public class ComplexCalcFactory implements CCalculableFactory{
    @Override
    public ComplexCalculable create(Complex complexArg) {
        return new Complex(complexArg);
    }
}
