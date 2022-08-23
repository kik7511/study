package com.mycompany.study.ch06;
public class CarSecond {

        String name = "아반떼";
        String color = "red";
        int cc = 1500;
        
        /*
        CarSecond(String str){
            color = str;
        }
         
        CarSecond(String str){
            color = str;
        }

        CarSecond(String str, int num){
            color = str;
            cc = num;
        }
        */     
        
        CarSecond(String name){
            this.name=name;
        }

        CarSecond(String name, int cc){
            this.name=name;
            this.cc=cc;
        }

        CarScond(String name, String color, int cc){
            this.name = name;
            this.color = color;
            this.cc = cc;
        }
    //오버로드
}
