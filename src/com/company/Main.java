package com.company;

import java.time.LocalTime;

public class Main {
    //Задание №1 + №3
    public static void main(String[] args) {
        int price = 43;
        int value = 50;
        String task_1 = "Стоймость оплаты за бензин: ";
        String task_3 = "Перевод секунд в часы: ";

        double money = price * value;
        System.out.println(task_1 + money); // Вывод расёта
        new Main().task_2();
        System.out.println(task_3 + LocalTime.ofSecondOfDay(3600)); //Вывод перевода секунд в часы
    }
    public void task_2() {
        int gross = 70000;
        double net = gross * 0.87; //рассчитываем зарплату после вычета ндфл
        String task = "Зарплата чистыми: ";
        System.out.println(task + net);
    }
}