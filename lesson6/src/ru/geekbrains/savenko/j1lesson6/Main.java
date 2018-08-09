package ru.geekbrains.savenko.j1lesson6;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.run(250);
        System.out.println("-----------------");
        Cat cat2 = new Cat();
        cat2.jump(2.2);
        System.out.println("-----------------");
        Cat cat3 = new Cat();
        cat3.swim(10);
        System.out.println("-----------------");
        Dog dog1 = new Dog();
        dog1.swim(12);
        System.out.println("-----------------");
        Dog dog2 = new Dog();
        dog2.run(600);
        System.out.println("-----------------");
        Dog dog3 = new Dog();
        dog3.jump(1);

    }

    }

