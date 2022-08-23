package com.mycompany.study.ch06;
public class ArithmeticOperationExample {
    public static void main(String[] args) {
        ArithmeticOperation arithmetic = new ArithmeticOperation();

        int resultplus = arithmetic.plus(2, 3);
        int resultminus = arithmetic.minus(5, 2);
        int resultmultiply = arithmetic.multiply(5, 4);
        int resultdivide = arithmetic.divide(20, 2);
        
         arithmetic.result(resultplus);
         arithmetic.result(resultminus);
         arithmetic.result(resultmultiply);
         arithmetic.result(resultdivide);
    }
}