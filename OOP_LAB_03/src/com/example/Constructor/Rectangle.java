//Write a java program to create a class Rectangle with height and width attributes. 
//Print the area and perimeter of that rectangle.

package com.example.Constructor;

public class Rectangle {
	
	private int height;
	private int width;
	
	public Rectangle(int h,int w) {
		height=h;
		width=w;
	}
	
	public int getArea(){
		return (height*width);
	}
	
	public int getPerimeter() {
		return 2*(height+width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1=new Rectangle (6,8);
		
		System.out.println("The area is "+r1.getArea());
		System.out.println("The perimeter is "+r1.getPerimeter());

	}

}
