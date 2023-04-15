package org.simple;

public class Animal {
    protected String name;

    public void animalInfo() {
        System.out.println("Информация о животном " + name);
    }

    public void voice() {
        System.out.println("Издаем звук: ");
    }

    public void jump() {
        System.out.println("Животное прыгнуло!");
    }
}
