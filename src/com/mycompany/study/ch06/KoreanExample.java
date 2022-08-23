package com.mycompany.study.ch06;
public class KoreanSecondExample{
    public static void main(String[] args) {
        Korean k1 = new korean("장원영", "011225-1234567");
        System.out.println("k1.name : "+k1.name);
        System.out.println("k1.ssn : "+k1.ssn);

        Korean k2 = new korean("장원영", 45);
        System.out.println("k2.name : "+k2.name);
        System.out.println("k2.age : "+k2.age);
    }
}