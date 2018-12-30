package com.math.cal.Calc;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("sum : "+Calculator.doAddition(3, 4));
		System.out.print("sum : "+Calculator.doSubtraction(3, 4));
		System.out.print("sum : "+Calculator.doMultiplication(3, 4));

	}
	
	public static int doAddition(int x , int y) {
		
		return x+y; 
	}
	
	public static int doSubtraction(int x , int y) {
		
		return x-y;
	}
	
	public static int doMultiplication(int x , int y) {
		
		return x*y;
	}
}
