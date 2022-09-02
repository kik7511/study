package com.mycompany.study.ch07.third;

public class ComputerExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		int param = 7;
		
		System.out.println("원의 반지름: "+param);
		System.out.println();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: "+ calculator.areaCircle(param));
		System.out.println();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: "+ computer.areaCircle(param));

	}

}
