package SimpleBox;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Calculator {
    public Double sum(List<? extends Number> list) {
        Double result = 0.0;
        for (Number num :
                list) {
            result += num.doubleValue();
        }
        return result;
    }

    public Double multiple(List<? extends Number> list) {
        Double result = 1.0;
        for (Number num :
                list) {
            result *= num.doubleValue();
        }
        return result;
    }

    public Double divide(List<? extends Number> list) {
        Double result = 1.0;
        for (Number num :
                list) {
            if (num.doubleValue() == 0)
                System.out.println("Деление на ноль невозможно. Проверьте элементы списка.");
            else
                result /= num.doubleValue();
        }
        return result;
    }

    public ArrayList<String> numberListToBinary(List<? extends Number> list) {
        ArrayList<String> resultList = new ArrayList<>();
        for (Number num :
                list) {
            Double result = num.doubleValue();
            Integer number = result.intValue();
            resultList.add(Integer.toBinaryString(number));
        }
        return resultList;
    }

    public ArrayList<String> listToBinary(List<?> list) {
        ArrayList<String> resultList = new ArrayList<>();
        try {
            for (Object num :
                    list) {
                Double result = Double.parseDouble(num.toString());
                Integer number = Math.round(result.intValue());
                resultList.add(Integer.toBinaryString(number));
            }
        } catch (Exception e) {
            System.out.println("Неверные исходные данные.");
        }
        return resultList;
    }
}
