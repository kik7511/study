package com.mycompany.study.ch02;

public class Hello {

	public static void main(String[] args) {
		String name = "탑건";
		double rate=30.3;
		String director="조셉 코신스키";
		String main_actor="톰 쿠르즈";
		String genre="액션";
		int limited_age=12;
		int running_time=120;
		String country="미국";
		
		System.out.println("영화 이름은 " + name);
		System.out.println("예매율은 " + rate + "입니다");
		System.out.println("감독의 이름은 " + director + "입니다");
		System.out.println("주연 배우는 " + main_actor + "입니다");
		System.out.println("이 영화는 " + limited_age + "세 이상만 관람 가능합니다");
		System.out.println("이 영화의 상영 시간은 " + running_time + "분 입니다");
		System.out.println("이 영화는 " + country + "에서 나왔습니다");
		System.out.println("장르는 " + genre + "입니다");
	}

}
