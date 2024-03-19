//Write a java program to create a class dog with a name and breed attribute. 
//Create two instances of dog class. 
//Set their attributes using the constructor and modify the attributes 
//using the setter methods and print the updated value.

package com.example.Constructor;

public class Dog {
	private String name;
	private String breed;
	
	public Dog(String n,String b) {
		name=n;
		breed=b;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	
	
	public void setName(String n) {
		name=n;
	}
	
	public void setBreed(String b) {
		breed=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1=new Dog("Ricky","Huskey");
		Dog d2=new Dog("Charlie","Bull Dog");
		
		System.out.println(d1.getName()+" is a "+d1.getBreed());
		System.out.println(d2.getName()+" is a "+d2.getBreed());
		
		System.out.println("\nAfter updating the values:\n");
		
		d1.setName("Tommy");
		d2.setBreed("Hound");
		
		System.out.println(d1.getName()+" is a "+d1.getBreed());
		System.out.println(d2.getName()+" is a "+d2.getBreed());
	
	}

}
