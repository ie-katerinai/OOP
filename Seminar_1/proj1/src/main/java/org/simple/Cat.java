package org.simple;

public class Cat extends Animal{
    private String color;
    private Integer age;


    public Cat(String name, String color, Integer age){
        this.name=name;
        this.color=color;
        if(age < 0){
            System.out.println("Данные введены некорректно");
        } else {
              this.age = age;}
        }
        //this.age=age;
    public Cat(){
        this("Барсик", "Белый", 5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age >=0){
            this.age = age;
        }
        else{
            System.out.println("Данные введены некорректно");
        }

    }

    public void catInfo(){
        System.out.println(String.format("Кот по имени %s цвет %s и возрастом %d лет", name, color, age));
    }

    @Override
    public void voice() {
        System.out.println("Мяу-мяу!");
    }
}
