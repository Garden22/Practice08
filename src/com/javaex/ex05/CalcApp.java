package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while (true) {
    		System.out.print(">>");
    		String[] nums = sc.nextLine().split(" ");
    		
    		if (nums[0].equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		
    		} else {
    			int a = Integer.valueOf(nums[0]); // 처리방법... 다시 고민...
    			int b = Integer.valueOf(nums[2]);
    			
        		if (nums[1].equals("+")) {
        			Add cal = new Add();
        			cal.setValue(a, b);
        			System.out.println(cal.calculate());
        			
        		} else if (nums[1].equals("/")) {
        			Div cal = new Div();
        			cal.setValue(a, b);
        			try {
        				System.out.println(cal.calculate());
        			} catch (ArithmeticException e) {
        				System.out.println("0으로 나눌 수 없습니다.");
        			}
        			
        		} else if (nums[1].equals("*")) {
        			Mul cal = new Mul();
        			cal.setValue(a, b);
        			System.out.println(cal.calculate());
        			
        		} else if (nums[1].equals("-")) {
        			Sub cal = new Sub();
        			cal.setValue(a, b);
        			System.out.println(cal.calculate());
        			
        		} else {
        			System.out.println("알 수 없는 연산자입니다.");
        			
        		}
    		}
    	}
    	sc.close();
    }
}
