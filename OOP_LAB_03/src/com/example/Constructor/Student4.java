package com.example.Constructor;

public class Student4 {
	
	int id;
	String name;
	
	Student4(int i, String n){
		id=i;
		name=n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student4 s1=new Student4(1112,"Emran");
		Student4 s2=new Student4(1113,"Mahdi");
		
		s1.display();
		s2.display();

	}

}
