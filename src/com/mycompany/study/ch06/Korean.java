package com.mycompany.study.ch06;
public class Korean{
    String name;
    int age;
    String ssn;

    Korean(){

    }

    Korean(String name, int age){
        this.name=name;
        this.age=age;
    }

    Korean(String name, String ssn){
        this.name=name;
        this.ssn=ssn;
    }

    static String nationality = "대한민국";

    static int staticTest(int a){
        return a + 10;
    }

    int test1(){
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        
        return arithmeticOperation.multiply(2, 3);
    }


    public void test2(){
        ArithmeticOperation.staticTest();
    }
}