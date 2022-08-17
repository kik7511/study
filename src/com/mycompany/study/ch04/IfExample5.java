package com.mycompany.study.ch04;

public class IfExample5 {
    int x=2;
    int y=3;
    
    if(a>x && y>0){
        System.out.println("1사분면입니다");
    }else if(x>0 && y<0){
        System.out.println("2사분면입니다");
    }else if(x<0 && y<0){
        System.out.println("3사분면입니다");
    }else if(x<0 && y>0){   
        System.out.println("4사분면입니다");
    }else if(x==0 && y!=0){
        System.out.println("x축 위에 있습니다");
    }else if(x!=0 && y==0){
        System.out.println("y축 위에 있습니다");
    }else{
        System.out.println("원점에 있습니다");
    }
}
    

}
