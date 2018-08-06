package ru.geekbrains.savenko.j1lesson6;

public class Dog {

    int selfDistanceRoad = 500 + (int) (Math.random() * 200);
    int selfDistanceBasin = 10 + (int) (Math.random() * 10);
    double selfObstacleHeight = 0.5 + (Math.random() * 2);

    public void run(int distanceRoad) {
        if (this.selfDistanceRoad >= distanceRoad) {
            System.out.println("Результат: Dog run: " + true + " " + this.selfDistanceRoad + "м. Максимум сколько может пробежать собака.");
        } else
            System.out.println("Результат: Dog run: " + false + " " + this.selfDistanceRoad + "м. Максимум сколько может пробежать собака.");
    }

    public void swim(int distanceBasin) {
        if (this.selfDistanceBasin >= distanceBasin) {
            System.out.println("Результат: Dog swim: " + true + " " + this.selfDistanceBasin + "м. Максимум сколько может проплыть собака.");
        } else
            System.out.println("Результат: Dog swim: " + false + " " + this.selfDistanceBasin + "м. Максимум сколько может проплыть собака.");
    }

    public void jump(double obstacleHeight) {
        if (this.selfObstacleHeight >= obstacleHeight) {
            System.out.println("Результат: Dog jump: " + true + " " + Math.round(this.selfObstacleHeight) + "м. Максимальная высота прыжка собаки.");
        } else
            System.out.println("Результат: Dog jump: " + false + " " + Math.round(this.selfObstacleHeight) + "м. Максимальная высота прыжка собаки.");
    }
}
