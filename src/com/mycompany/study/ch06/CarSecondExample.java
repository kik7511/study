package com.mycompany.study.ch06;
public class CarSecondExample {
    public static void main(String[] args) {
        CarSecond carSecond = new CarSecond();    

        CarSecond carSecond2 = new CarSecond("아반떼");
        CarSecond carSecond3 = new CarSecond("아반떼",3000);
        CarSecond carSecond4 = new CarSecond("아반떼","blue",3000);

        System.out.println(carSecond2);
        


    }
}