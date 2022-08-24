package com.mycompany.study.ch06;
public class ArithmeticOperation {
    
    public int plus(int a, int b){
        int result = 0;
        result = a + b;
        return result;
    }

    public int minus(int a, int b){
        int result = 0;
        result = a - b;
        return result;
    }

    public int multiply(int a, int b){
        int result = 0;
        result = a * b;
        return result;
    }

    public int divide(int a, int b){
        int result = 0;
        result = a / b;
        return result;
    }

    public void result(int number){
        System.out.println("답은 " + number  + "입니다.");
    }

    static void staticTest(){
        System.out.println("나는 놀고 싶다");
    }
}