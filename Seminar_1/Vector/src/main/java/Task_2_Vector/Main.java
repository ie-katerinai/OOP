package Task_2_Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(1.0, 2.0, 3.0);
        System.out.println(vector);
        System.out.println(vector.vectorLenght());

        Vector vector2 = new Vector(3.0, 4.0, 5.0);
        System.out.println(vector.vectorScalar(vector2));

        System.out.println(vector.composition(vector2));

        System.out.println(vector.cosinus(vector2));

        System.out.println(vector.sum(vector2));

        System.out.println(vector.difference(vector2));
    }
}
