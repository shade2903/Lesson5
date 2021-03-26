package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9,0,4564,9679,456,2));


    }

    // ПЕРЕГРУЗКА МЕТОДА sum()
    //для создания новой перегрузки необходимо либо изменить количество параметров
    //либо один из типов любого параметра
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum( int...arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;


    }
}
