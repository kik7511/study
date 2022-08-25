package com.mycompany.study.ch07.first;

public class Student extends People {
	
	//필드
		public int studentNo;
		
	//생성자
		Student(){
			
		}
		
		public Student(String name, String ssn, int studentNo) {
			super(name, ssn);
			this.studentNo=studentNo;
		}
		
		public Student(String name, String ssn) {
			super(name, ssn);
		}
		
	//메소드
		
		
}
