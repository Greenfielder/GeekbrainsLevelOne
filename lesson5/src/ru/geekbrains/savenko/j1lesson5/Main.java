package ru.geekbrains.savenko.j1lesson5;

public class Main {

    public static void main(String[] args) {

        Associate[] associates = new Associate[5];

        associates[0] = new Associate("Hulk", "Hogan", "ExWrestler", "hulkhogan@gmail.com",
                5554321, 50000, 64);

        associates[1] = new Associate("Steve", "Austin", "ExWrestler", "steveaustin@gmail.com",
                5557777, 45000, 53);

        associates[2] = new Associate("Roman", "Reigns", "Superstar wrestler", "romanreigns@gmail.com",
                5559876, 70000, 33);

        associates[3] = new Associate("Shinsuke", "Nakamura", "Wrestler", "shinsukenakamura@gmail.com",
                5550001, 60000, 38);

        associates[4] = new Associate("Kurt", "Angle", "General manager", "kurtangle@gmail.com",
                5553344, 55000, 49);

        System.out.println("Список сотрудников старше 40 лет: ");
        System.out.println("---------------------------------");

        for (int i = 0; i < associates.length; i++) {
            if (associates[i].getAge() > 40)
                associates[i].showInfo();
        }
    }
}

