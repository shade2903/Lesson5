package com.company.oop;

import java.sql.SQLOutput;

// название класса должно совпадать с именем файла
// класс это шаблон для создания объекта
public class Car {
    String color; // свойство
    int maxSpeed;
    public void drive(){
        System.out.println("car is driving"); // действие
    }
    public void stop(){
        System.out.println("car was stopped");
    }
    public void raceTimeDistance(){
        System.out.println((double)1000/maxSpeed);
    }


}
