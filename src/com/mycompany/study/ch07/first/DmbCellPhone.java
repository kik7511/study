package com.mycompany.study.ch07.first;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(){
		
	}
	
	DmbCellPhone(String model, String color, int Channel){
		
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("DMB 전원을 켭니다");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 전원을 끕니다");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println(channel + "번으로 이동합니다");
	}
}
