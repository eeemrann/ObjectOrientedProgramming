package com.example.Swap_Numbers;

import java.util.Scanner;

public class Swap_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,temp;
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter a number: ");
		x=sc.nextInt();

		System.out.println("Enter another number: ");
		y=sc.nextInt();

		
		System.out.println("Before swapping:");
		System.out.println("First number = "+x);
		System.out.println("Second number = "+y);

		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swapping:");
		System.out.println("First number = "+x);
		System.out.println("Second number = "+y);

	}

}
