package com.mycompany.study.ch06;
public class CarSecondExample {
    public static void main(String[] args) {
        CarScond carSecond = new CarSecond();    

        CarScond carSecond2 = new CarSecond("아반떼");
        CarScond carSecond3 = new CarSecond("아반떼",3000);
        CarScond carSecond4 = new CarSecond("아반떼","blue",3000);

        System.out.println(carSecond2);
        


    }
}