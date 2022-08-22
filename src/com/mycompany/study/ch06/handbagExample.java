package com.mycompany.study.ch06;

public class handbagExample {
    public static void main(String[] args) {
        handbag handbag = new handbag();

        System.out.println(handbag.handbag[1]);

        handbag.hb();

        handbag.handbag[1] = "에르메스";
        System.out.println(handbag.handbag[1]);
    }

}
