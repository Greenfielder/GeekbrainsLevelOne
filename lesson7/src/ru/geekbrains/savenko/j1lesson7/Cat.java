package ru.geekbrains.savenko.j1lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate bigPlate) {
        if (bigPlate.getFood() > appetite) {
            bigPlate.decreaseFood(appetite);
            satiety = true;
        }
    }

}
