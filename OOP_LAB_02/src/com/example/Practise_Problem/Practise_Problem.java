//Problem-//Problem-Write a Java Program to create a class and call Person with three attributes (name,age,birth).Now create two objects or instances of the person class and set their attributes using their constructor and bring their age,name and birth.

//Write a Java Program to create a class and call Person with three attributes (name,age,birth).
//Now create two objects or instances of the person class and set their attributes using their
//constructor and bring their age,name and birth.


package com.example.Practise_Problem;

public class Practise_Problem {
	private String name;
	private int age;
	private String dob;

	
	public Practise_Problem(String name, int age, String dob) {
	this.name=name;
	this.age=age;
	this.dob=dob;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDob() {
		return dob;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practise_Problem person1= new Practise_Problem ("John", 40, "14_JAN_1991");
		Practise_Problem person2=new Practise_Problem("Elahi",46,"14_FEB_1985");

		System.out.println(person1.getName()+" is "+person1.getAge()+" years old and his dob is "+person1.getDob());
		System.out.println(person2.getName()+" is "+person2.getAge()+" years old and his dob is "+person2.getDob());

	}

}
