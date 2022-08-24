package com.mycompany.study.ch06;

public class Board {    

    //field
    String name="김대겸";   
    int view=10;
    boolean useYN=true;

    //method

    Board(){

    }    

    Board(String name){
        this.name = name;
    } 

    Board(String name, int view){
        this.name = name;
        this.view = view;
    }

    Board(String name, boolean useYN){
        this.name = name;
        this.useYN = useYN;
    }

    Board(String name, int view, boolean useYN){
        this.name = name;
        this.view = view;
        this.useYN = useYN;        
    }   

    public void say(){
        
        System.out.println(name + "님이 " + view + "번 조회하셨습니다." + "사용여부는 "  +useYN + "입니다.");
    }
}
