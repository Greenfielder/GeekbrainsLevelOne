package ru.geekbrains.savenko.j1lesson5;

public class Associate {

    private String name;
    private String lastName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    protected Associate(String name, String lastName, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void showInfo() {
        System.out.println("Имя: " + name + " Фамилия: " + lastName + " Должность: " + position + " E-mail: " + email +
                " Телефон: " + phone + " Зарплата: " + salary + " Возраст: " + age);
        System.out.println();
    }

}

