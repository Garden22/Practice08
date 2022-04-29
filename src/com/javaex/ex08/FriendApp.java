package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Friend[] fArray = new Friend[3];
		System.out.println("친구를 3명 등록해주세요.");
		
		for (int i = 0; i < 3; i ++) {
			String[] info = sc.nextLine().split(" ");
			fArray[i] = new Friend(info[0], info[1], info[2]);
		}
		
		for (int i = 0; i < 3; i++) {
			fArray[i].showInfo();
		}
		
		sc.close();
	}
}
