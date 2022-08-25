package com.mycompany.study.ch07.first;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("김대겸", "931017", 3);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Student student2 = new Student("김무겸", "951123");
		System.out.println(student2.name);
		System.out.println(student2.ssn);
	
			
		

	}

}
