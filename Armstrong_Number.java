package com.java_programs;

import java.util.Scanner;

public class Armstrong_Number {
	
	public static void main(String[] args) {
		
		int a ;
		int n ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		a = s.nextInt();
		n=a;
		int i = 0;
		int j = 0;
		
		while (n>0) {
			
			i = n % 10;
			j = j + (i * i * i);
			n = n / 10;
		}
		
		if (a == j) {
			
			System.out.println("The number is an Armstrong Number");
		
		} 
		
		else {
		
			System.out.println("The number is not an Armstrong Number");
			
		}
	}

}
