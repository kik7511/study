package com.mycompany.study.ch07.third;

public class ComputerExample1 {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		
		System.out.println("원면적: " + calculator.areaCircle(2));
		
		Computer1 computer = new Computer1();
		
		System.out.println("원면적: " + computer.areaCircle(2));
		
	}

}
