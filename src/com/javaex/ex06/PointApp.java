package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3); 
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1; // 같은 주소 참조
		
		System.out.println(p1 == p2); // f 값을 같지만 다른 주소 참조
		System.out.println(p2 == p3); // f
		System.out.println(p3 == p4); // f
		System.out.println(p4 == p1); // t 같은 주소 참조		
		System.out.println(p1.equals(p2)); // f 다른 객체
		System.out.println(p4.equals(p1)); // t 같은 객체
		
		// equals는 조상 클래스인 Object의 메소드이므로 따로 정의하지 않아도 실행됨.
	}

}


