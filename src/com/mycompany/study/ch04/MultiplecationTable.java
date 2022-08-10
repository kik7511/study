package com.mycompany.study.ch04;

public class MultiplecationTable {
    public static void main(String[] args) {
        //2단 출력
        for(i=1; i<10; i++){
            System.out.println("2 * "+i+"="+(2*i));
        }

        //2단부터 9단까지 출력하는 프로그램 작성

        for(i=1; i<10; i++){
            for(j=1; j<10; j++){
                int result= i*j;
            }
            System.out.println(i+"*"+j+"="+result);
        }
    }
    
}
