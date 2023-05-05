package calculator;

public interface ComplexCalculable {
    ComplexCalculable sum(Complex z);
    ComplexCalculable multi(Complex z);
    Complex getResult();
}
