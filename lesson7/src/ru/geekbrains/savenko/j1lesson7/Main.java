package ru.geekbrains.savenko.j1lesson7;

public class Main {

    public static void main(String[] args) {

        Cat[] kitty = {new Cat("Том", 12), new Cat("Китти", 10), new Cat("Мурза", 20)
                , new Cat("Пират", 28), new Cat("Рокки", 7)};

        Plate plate = new Plate(10);
        plate.info();
        System.out.println("Накладываем корм для котят");
        plate.increaseFood(50);
        plate.info();

        for (Cat cats : kitty) {
            cats.eat(plate);
            System.out.println("Котёнок " + cats.getName() + " поел: " + cats.isSatiety());
            plate.info();
        }
    }
}