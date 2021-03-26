package com.company.oop;
//ООП это объектно - ориентированное програмирование
// Принципы ООП:
// 1.инкапсуляция - способность создавать объекты
// 2.полиморфизм
// 3.наследование
// 4.абстракция

// объект в Java это некая сущность, которая содержит набор свойств(атрибутов)
// и может выполнять заданный набор действий
// Например, объект Car:
// свойства: color, name, view ...
// действия: drive,stop, break ...
// для создания объекта(-ов) необходимо описать класс(class)
public class MainApp {
        public static void main(String[] args) {
            // создание объекта.
            Car bmv = new Car();
            bmv.color="black";
            bmv.maxSpeed = 240;
            bmv.drive();
            bmv.stop();
            bmv.raceTimeDistance();

            Car audi = new Car();
            audi.color ="red";
            audi.maxSpeed = 220;
            audi.raceTimeDistance();


    }
}
