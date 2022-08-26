package com.mycompany.study.ch07.forth;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
		supersonicAirplane.takeoff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
		//상수파일 생성 후 코드
		supersonicAirplane.takeoff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.NORMAl;
		supersonicAirplane.fly();
		supersonicAirplane.land();

	}

}
