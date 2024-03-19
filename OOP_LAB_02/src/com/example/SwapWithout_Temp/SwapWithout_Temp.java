package com.example.SwapWithout_Temp;

import java.util.Scanner;

public class SwapWithout_Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter a number: ");
		x=sc.nextInt();

		System.out.println("Enter another number: ");
		y=sc.nextInt();

		
		System.out.println("Before swapping without temp:");
		System.out.println("First number = "+x);
		System.out.println("Second number = "+y);

		x=x-y;
		y=x+y;
		x=y-x;
		
		System.out.println("After swapping without temp:");
		System.out.println("First number = "+x);
		System.out.println("Second number = "+y);

	}

}
