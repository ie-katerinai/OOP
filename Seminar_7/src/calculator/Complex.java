package calculator;

public class Complex implements ComplexCalculable {
    private static final double EPs = 1e-12;
    private double re, im;
    Complex result;

    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    Complex(double re) {
        this(re, 0.0);
    }

    Complex() {
        this(0.0, 0.0);
    }

    Complex(Complex z) {
        this(z.re, z.im);
    }

    public String toString() {
        return re + " + i" + im;
    }

    @Override
    public ComplexCalculable sum(Complex z) {
        result = new Complex(re + z.re, im + z.im);
        return result;
    }

    @Override
    public ComplexCalculable multi(Complex z) {
        double t = re * z.re - im * z.im;
        im = re * z.im + im * z.re;
        re = t;
        result = new Complex(re, im);
        return result;
    }

    @Override
    public Complex getResult() {
        return result;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex getZ() {
        return new Complex(re, im);
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void setZ(Complex z) {
        re = z.re;
        im = z.im;
    }

    public boolean equals(Complex z) {
        return Math.abs(re - z.re) < EPs &&
                Math.abs(im - z.im) < EPs;
    }
}
