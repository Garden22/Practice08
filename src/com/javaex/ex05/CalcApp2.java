package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp2 {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while (true) {
    		System.out.print(">>");
    		String[] nums = sc.nextLine().split(" ");
    		
    		if (nums[0].equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		
    		} else {
    			int a = Integer.valueOf(nums[0]); 
    			int b = Integer.valueOf(nums[2]);
    			
    			switch (nums[1]) {
    				case "+":
    					Add plus = new Add();
            			plus.setValue(a, b);
            			System.out.println(plus.calculate());
            			break;
            		
    				case "-":
    					Sub minus = new Sub();
            			minus.setValue(a, b);
            			System.out.println(minus.calculate());
            			break;
            		
    				case "/":
    					Div division = new Div();
            			division.setValue(a, b);
            			try {
            				System.out.println(division.calculate());
            			} catch (ArithmeticException e) {
            				System.out.println("0으로 나눌 수 없습니다.");
            			}
            			break;
            		
    				case "*":
    					Mul multiply = new Mul();
            			multiply.setValue(a, b);
            			System.out.println(multiply.calculate());
            			break;
            		
    				default:
            			System.out.println("알 수 없는 연산자입니다.");
            			break;    					
    			}
    		}
    	}
    	sc.close();
    }
}
