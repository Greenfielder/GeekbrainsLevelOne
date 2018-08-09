package ru.geekbrains.savenko.j1lesson6;

public class Cat extends Animal {
    int selfDistanceRoad = 200 + (int) (Math.random() * 100);
    int selfDistanceBasin = 0;
    double selfObstacleHeight = 2 + (Math.random() * 2);

    public void run(int distanceRoad) {
        if (this.selfDistanceRoad >= distanceRoad) {
            System.out.println("Результат: Cat run: " + true + " " + this.selfDistanceRoad + "м. Максимум сколько может пробежать кошка.");
        } else
            System.out.println("Результат: Cat run: " + false + " " + this.selfDistanceRoad + "м. Максимум сколько может пробежать кошка.");
    }

    public void swim(int distanceBasin) {
        if (this.selfDistanceBasin >= distanceBasin) {
            System.out.println("Результат: Cat swim: " + true + " :Это сверхкошка! ");
        } else System.out.println("Результат: Cat swim: " + false + " :Кошка не может плавать!");
    }

    public void jump(double obstacleHeight) {
        if (this.selfObstacleHeight >= obstacleHeight) {
            System.out.println("Результат: Cat jump: " + true + " " + Math.round(this.selfObstacleHeight) + "м. Максимальная высота прыжка кошки.");
        } else
            System.out.println("Результат: Cat jump: " + false + " " + Math.round(this.selfObstacleHeight) + "м. Максимальная высота прыжка кошки.");
    }
}


