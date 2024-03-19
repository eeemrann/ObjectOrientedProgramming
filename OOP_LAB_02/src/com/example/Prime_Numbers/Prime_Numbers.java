package com.example.Prime_Numbers;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int c=0;

	        Scanner obj=new Scanner (System.in);

	        System.out.println("Enter your number: ");

	        int num = obj.nextInt();

	        for(int i=2; i<=num/2; i++){
	            if(num%i==0)
	            {
	               c++;
	               break;
	            }

	        }

	        if(c==0){
	            System.out.println("Prime Number");
	        }

	        else{
	            System.out.println("Not a Prime Number");
	        }
	}

}
