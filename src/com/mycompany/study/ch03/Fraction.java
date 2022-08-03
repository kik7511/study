package com.mycompany.study.ch03;

import java.util.Scanner;



public class Fraction {

	int numerator;	//분자필드

	int denominator;	//분모필드

	public Fraction(){

		this.numerator = 1;		//분자1설정

		this.denominator = 1;	//분모1설정

	}

	public Fraction(int d) {

		this.numerator = 1;		//분자1설정

		this.denominator = d;	//분모d설정

	}

	public Fraction(int n, int d) {

		this.numerator = n;			//분자n설정

		this.denominator = d;		//분모d설정

	}

	/*

	 * 분수의 덧셈

	 * 분자 (a * d) + (c *b)

	 * 분모 b * d

	 */

	public static Fraction addFraction(Fraction frac1, Fraction frac2) {

		int nume = (frac1.numerator * frac2.denominator) + (frac2.numerator * frac1.denominator);

		int denomi = (frac1.denominator*frac2.denominator);

		Fraction frac3 = new Fraction(nume,denomi);

		return frac3;

	}

	/*

	 * 분수의 뺄셈

	 * 분자 (a * d) - (c *b)

	 * 분모 b * d

	 */

	public static Fraction subFraction(Fraction frac1, Fraction frac2) {

		int nume = (frac1.numerator * frac2.denominator) - (frac2.numerator * frac1.denominator);

		int denomi = (frac1.denominator*frac2.denominator);

		Fraction frac3 = new Fraction(nume,denomi);

		return frac3;

	}

	/*

	 * 곱셈

	 * 분자 a * c

	 * 분모 b * d

	 */

	public static Fraction mulFraction(Fraction frac1, Fraction frac2) {

		int nume = (frac1.numerator * frac2.numerator);

		int denomi = (frac1.denominator*frac2.denominator);

		Fraction frac3 = new Fraction(nume,denomi);

		return frac3;

	}

	/*

	 * 나눗셈

	 * 분자 a * d

	 * 분모 b * c

	 */

	public static Fraction divFraction(Fraction frac1, Fraction frac2) {

		int nume = (frac1.numerator * frac2.denominator);

		int denomi = (frac1.denominator*frac2.numerator);

		Fraction frac3 = new Fraction(nume,denomi);

		return frac3;

	}

	/*

	 * Fraction 1,2를 입력하여

	 * 덧셈, 뺄셈, 곱셈, 나눗셈 프로그램을 실행한다.

	 */

	public void printFraction(Fraction frac1, Fraction frac2) {

		Fraction frac3 = Fraction.addFraction(frac1, frac2);

		Fraction frac4 = Fraction.subFraction(frac1, frac2);

		Fraction frac5 = Fraction.mulFraction(frac1, frac2);

		Fraction frac6 = Fraction.divFraction(frac1, frac2);

		System.out.println("--------------------------------");

		System.out.println(frac1.numerator+"/"+frac1.denominator+"+"

							+frac2.numerator+"/"+frac2.denominator+"="+

							frac3.numerator+"/"+frac3.denominator);

		System.out.println(frac1.numerator+"/"+frac1.denominator+"-"

				+frac2.numerator+"/"+frac2.denominator+"="+

				frac4.numerator+"/"+frac4.denominator);

		System.out.println(frac1.numerator+"/"+frac1.denominator+"x"

				+frac2.numerator+"/"+frac2.denominator+"="+

				frac5.numerator+"/"+frac5.denominator);

		System.out.println(frac1.numerator+"/"+frac1.denominator+"/"

				+frac2.numerator+"/"+frac2.denominator+"="+

				frac6.numerator+"/"+frac6.denominator);

	}

	public static void main(String[] args) {

		int input1,input2,input3, input4;		

		Scanner in = new Scanner(System.in);

		System.out.println("분수1(분자 분모) 입력: ");

		input1 = in.nextInt();

		input2 = in.nextInt();

		Fraction fraction1 = new Fraction(input1,input2);	//input1을 분자, input2를 분모로 설정	

		System.out.println("분수2(분자 분모) 입력: ");

		input3 = in.nextInt();

		input4 = in.nextInt();

		Fraction fraction2 = new Fraction(input3, input4);		//input3을 분자, input4를 분모로 설정		

		fraction1.printFraction(fraction1, fraction2);

	}

}

