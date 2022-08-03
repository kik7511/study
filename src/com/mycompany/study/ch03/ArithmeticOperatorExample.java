package com.mycompany.study.ch03;

/*
import java.util.Scanner;

class Fraction{
	int numerator;
	int demonminator;
	
	public Fraction() {
		this.numerator=1;
		this.demonminator=1;
	}
	public Fraction(int d) {
		this.numerator=1;
		this.demonminator=d;
	}
	public Fraction(int n,int d) {
		this.numerator=n;
		this.demonminator=d;
	}
		
	public static Fraction addFraction(Fraction frac1, frac2) {
		int nume=(frac1.numerator*frac2.demonminator)+(frac2.numerator*frac1.demonminator);
		int denomi=(frac1.demonminator*frac2.demonminator);
		Fraction frac3=new Fraction(nume,denomi);
		return frac3;
	}
}
*/	
public class ArithmeticOperatorExample {
	

	public static void main(String[] args) {
		
		/*
		int v1=5;
		int v2=2;
		
		int result1=v1+v2;
		int result2=v1-v2;
		int result3=v1*v2;
		int result4=v1/v2;
		int result5=v1%v2;
		double result6=v1/v2;
		double result7=(double)v1/v2;
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		int x=8;
		int y=7;
		int z=5;
		int result1=x+y+z;
		System.out.println(result1);
		
		int a=1;
		int b=9;
		int c=5;
		int result2=a+b+c;
		System.out.println(result2);
		
		int d=5;
		int e=6;
		int f=6;
		int result3=d+e+f;
		System.out.println(result3);
		
		int g=4;
		int h=7;
		int i=1;
		int result4=g+h+i;
		System.out.println(result4);
		
		int a1=7;
		int b1=5;
		int c1=5;
		int result5=a1+b1+c1;
		System.out.println(result5);
		
		int a2=4;
		int b2=2;
		int c2=9;
		int result6=a2+b2+c2;
		System.out.println(result6);
		
		int a3=5;
		int b3=9;
		int c3=9;
		int result7=a3+b3+c3;
		System.out.println(result7);
		
		int result8=9+4+5;
		System.out.println(result8);
		*/
		
		//sum(1,2,3);
		//sum(4,2,9);
		//sum(7,9,9);
		
		
		average(60, 70, 85, 90, 45, "홍길동");
		average(50,75,70,60,70,"박말순");
		average(55,60,64,58,90,"고장난");
		average(80,70,63,88,78,"도롱뇽");
		
		
		}
	public static void average(int english, int math, int physis, int music, int athletic, String name) {
		double result= (double)(english+ math + physis + music + athletic)/5;
		System.out.println(name + "의 평균은 "+ result +"점 입니다.");
	}
	
	/*
	public static void sum(int a, int b, int c) {
		System.out.println(a + "+" + b + "+" + c + "=" + (a+b+c) );
		
	}
	*/
}
