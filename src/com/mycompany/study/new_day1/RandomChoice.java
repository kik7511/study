package com.mycompany.study.new_day1;

public class RandomChoice {
	String[] group = new String[] {"박소연","이예리","김대겸","전형진","최효주","권은율"};
	String[] member = new String[] {"김경은", "김경찬", "김영현", "김윤지", "윤준", "최민주", "최서영", "한구원"};
	
	static Double groupNumber = Math.random() * 6;
	static Double memberNumber = Math.random() * 8;
	
	
	public static void main(String[] args) {
		System.out.println(groupNumber);

	}

}
