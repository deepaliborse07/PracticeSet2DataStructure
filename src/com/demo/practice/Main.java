//write code to sort hashmap by values in java7
package com.demo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int rollno;
	String name,address;
	public Student(int rollno, String name, String address) {
		
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

}
class Sortbyroll implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.rollno-b.rollno;
	}
	
}

class Sortbyname implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(new Student(1,"Deepali","nasik"));
		ar.add(new Student(3,"Kavita","mumbai"));
		ar.add(new Student(2,"Sneha","Nagpur"));
		
		System.out.println("unsorted");
		for(int i=0;i<ar.size();i++) 
			System.out.println(ar.get(i));
		
		Collections.sort(ar,new Sortbyroll());
		
		System.out.println("/n Sorted by rollno");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		
		Collections.sort(ar,new Sortbyname());
		
		System.out.println("\n Sorted by name");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
	}

}
