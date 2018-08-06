package ru.geekbrains.savenko.j1lesson6;

public abstract class Animal {
    int selfDistanceRoad;
    int selfDistanceBasin;
    double selfObstacleHeight;

    public Animal() {
    }

    public abstract void run(int distanceRoad);

    public abstract void swim(int distanceBasin);

    public abstract void jump(double obstacleHeight);

}
