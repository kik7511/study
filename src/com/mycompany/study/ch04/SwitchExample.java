package com.mycompany.study.ch04;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class SwitchExample {
    int num=3;

    switch(num){
        case 1:
            System.out.println("1번이 나왔습니다");
            break;
        case 2:
            System.out.println("2번이 나왔습니다");
            break;
        defult:
            System.out.println("1도2도 아닌 정수입니다.");
            break;

    }

    String position = "사원";

    switch(position){
        case "사원":
            System.out.println("연봉은 5,000 입니다.");
            break;
        case "대리":
            System.out.println("연봉은 10,000 입니다.");
            break;
        case "과장":
            System.out.println("연봉은 15,000 입니다.");
            break;
        case "부장":
            System.out.println("연봉은 20,000 입니다.");
            break;
        defult:
            System.out.println("사원이 아닙니다");
            break
    }

}
