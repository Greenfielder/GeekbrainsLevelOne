package ru.geekbrains.savenko.j1lesson7;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int hungryIndex) {
        if (hungryIndex < food) {
            food -= hungryIndex;
            return;
        } else {
            System.out.println("В миске не достаточно еды");
            return;
        }
    }

    public void info() {
        System.out.println("В миске осталось: " + food);
    }

    void increaseFood(int amount) {
        food += amount;
    }


}
