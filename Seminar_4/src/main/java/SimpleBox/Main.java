//

package SimpleBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        SimpleBox smpl = new SimpleBox(200);
//        SimpleBox smp = new SimpleBox("Str");
//        SimpleBox sm = new SimpleBox(100);
//
//        sm.setObj("test");
//        if (smpl.getObj() instanceof Integer && sm.getObj() instanceof Integer) {
//            Integer sum = (Integer) smpl.getObj() + (Integer) sm.getObj();
//            System.out.println("Sum = " + sum);
//        } else
//            System.out.println("Тип не Integer");
//
//        GenBox<Integer> g1 = new GenBox(10);
//        GenBox<Integer> g2 = new GenBox(20);
//        Integer sum = g1.getObj() +g2.getObj();
//        Double[] array = new Double[2];
//        array[0] = 10.0;
//        array[1] = 20.0;
//
//        Integer[] array2 = new Integer[2];
//        array2[0] = 20;
//        array2[1] = 40;
//
//        BoxWithNumber<Double> box1 = new BoxWithNumber<>(array);
//        BoxWithNumber<Integer> box2 = new BoxWithNumber<>(array2);
//        System.out.println(box1.compare(box2));
////        System.out.println(smpl);
////        System.out.println(smp);
////        System.out.println(sm);
////        System.out.println("Sum= " + sm);
//
//        System.out.println(box1.average());
//        System.out.println(box2.average());

//        Calculator calc = new Calculator();
//        List<Double> ls1 = new ArrayList<>();
//        List<Integer> ls2 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            ls1.add((double) i);
//            ls2.add(i);
//        }
//        System.out.println(calc.sum(ls1));
//        System.out.println(calc.sum(ls2));
        List<Employee> empl = new ArrayList<>();
        LRUCache<Employee> cash = new LRUCache<Employee>(5);
        for (int i = 0; i < 10; i++) {
            Employee em = new Employee("Ivanov", 1234.0, "art" + i);
            cash.addElement(em);
        }
        System.out.println(cash.getAllEl());

        ArrayList<Integer> listNumber = new ArrayList<>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Double numb = rand.nextDouble(1,10);
            listNumber.add(numb.intValue());
        }
        System.out.println(listNumber);
        ArrayList<String> byaka = new ArrayList<>();
        byaka.add("wed");
        byaka.add("dw");
        byaka.add("23");
        Calculator calc = new Calculator();
//        System.out.println(calc.sum(listNumber));
//        System.out.println(calc.multiple(listNumber));
//        System.out.println(calc.subtract(listNumber));
//        System.out.println(calc.divide(listNumber));
//        System.out.println(calc.numberListToBinary(listNumber));
        System.out.println(calc.listToBinary(listNumber));
        System.out.println(calc.listToBinary(byaka));
    }

}
