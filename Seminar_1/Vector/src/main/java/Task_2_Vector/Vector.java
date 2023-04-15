package Task_2_Vector;

public class Vector {
    private Double x;
    private Double y;
    private Double z;
    public Vector(){

    }
    public Vector(Double x, Double y, Double z){
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    /**
     * @return Длина вектора
     */
    public Double vectorLenght(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    /**
     *
     * @param vector2 - вектор для вычисления произведения
     * @return скалярное произведение векторов
     */
    public Double vectorScalar(Vector vector2) {
        return  x*vector2.x + y*vector2.y + z*vector2.z;
    }

    /**
     * @param vector2 - вектор для вычисления произведения
     * @return векторное произведение
     */
    public Vector composition(Vector vector2) {
        return new Vector(
                y*vector2.z - z*vector2.y,
                z*vector2.x - x*vector2.z,
                x*vector2.y - y*vector2.x
        );
    }

    /**
     * @apiNote
     * @param vector2 - вектор для вычисления
     * @return угол между векторами через косинус
     */
    public Double cosinus(Vector vector2) {
        return vectorScalar(vector2) / (vectorLenght() * vector2.vectorLenght());
    }

    /**
     *
     * @param vector2 - вектор для вычисления
     * @return сумма векторов
     */
    public Vector sum(Vector vector2) {
        return new Vector(
                x+vector2.x,
                y+vector2.y,
                z+vector2.z
        );
    }

    /**
     *
     * @param vector2 - вектор для вычисления
     * @return разность векторов
     */
    public Vector difference(Vector vector2) {
        return new Vector(
                x-vector2.x,
                y-vector2.y,
                z-vector2.z
        );
    }
}
