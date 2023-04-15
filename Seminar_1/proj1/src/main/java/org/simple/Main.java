package org.simple;

public abstract class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
//            cat.name = "Барсик";
//            cat.color = "Рыжий";
//            cat.age = 4;
//            System.out.println("Cat = " + cat.name + ", цвет - " + cat.color + ". Возраст " + cat.age);
        Cat cat2 = new Cat("qwe", "asd", 123);
        cat2.setAge(4);
        cat2.catInfo();
        cat2.setAge(-10);
        cat2.catInfo();
//        System.out.println("Кот имя: " + cat2.getName() + ", цвет:" + cat2.getColor() + ", возраст" + cat2.get.Age());
//        cat2.getName();
//        System.out.println("Кот имя: " + cat2.getName() + ", цвет:" + cat2.getColor() + ", возраст" + cat2.get.Age());
        Cat cat3 = new Cat("qwe", "asd", -10);
        //System.out.println("Кот имя: " + cat2.getName() + ", цвет:" + cat2.getColor() + ", возраст" + cat2.get.Age());
        cat.voice();
        cat3.catInfo();
    }
}

