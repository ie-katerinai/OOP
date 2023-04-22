package SimpleBox;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoxWithNumber<T extends Number> {
    private T[] array;
    public double average(){
        double result = 0;
        for (int i=0; i<array.length; i++){
            result += array[i].doubleValue();
        }
        result /= array.length;
        return result;
    }

    public boolean compare(BoxWithNumber<?> box2) {
        return Math.abs(average()-box2.average()) < 0.0000001;
    }

}
