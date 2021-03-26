package com.company;
// число int n [0, 1000000]
//2^n = ? (вывести на экран!!!) - String

public class Main {
    public static void main(String[] args) {
//        System.out.println(sum(1,2,3,4,5,6,7,8,9,0,4564,9679,456,2));
//        System.out.println(fact(12));
//        System.out.println(fact2(5));
        System.out.println(sumDigts(745));


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

    //Рекурсия

    // расчет факториала 5! = 5*4*3*2*1 = 120
    public static int fact(int n){ // нахождение факториала через рекурсию
        int fact =1;
        for(; n > 1; n--){
            fact*=n;

        }
        return fact;
    }
    // расчет факториала через рекурсию (вызов метода в самом себе)
    //5! = 5*4!
    //4!= 3*3!
    //....
    //n! = n*(n-1)! = n*(n-1)*(n-2)!
    public static int fact2(int n){
        if (n==1){
            return 1;
        }
        return n*fact2(n-1);

    }
    // n =4
    // 4*3*2*1

    //Найти сумму цифр числа 1234%10 = 4
    //1234/10 = 123
    //123%10 =3
    //123/10 =12
    //...
    // 1%10 =1
    //1/10 =0
    public static int sumDigts(int n){
        if (n ==0) {
            return 0;
        }
        return (n%10) +sumDigts(n/10);

    }
}
