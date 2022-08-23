package com.mycompany.study.ch06;
public class KoreanTr {
    String name;
    String ssn;
    int age;

    KoreanTr(){

    }

    KoreanTr(Strint name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

    KoreanTr(String name, int age){
        this.name = name;
        this.age = age;
    }

    KoreanTr(String name, int age, String ssn){
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public static void main(String[] args) {
        KoreanTr koreanTr = new KoreanTr("김대겸", 30);
        System.out.println(koreanTr.name);

        KoreanTr koreanTr2 = new KoreanTr("김대겸", 30, "dkwit");
        System.out.println(koreanTr2.ssn);

    }

}
