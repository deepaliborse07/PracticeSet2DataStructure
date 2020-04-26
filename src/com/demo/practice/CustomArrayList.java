package com.demo.practice;

import java.util.ArrayList;

public class CustomArrayList {
	
	int n=4;
	
	class Data{
		int rollno;
		String name;
		int marks;
		long phone;
		public Data(int rollno, String name, int marks, long phone) {
			
			this.rollno = rollno;
			this.name = name;
			this.marks = marks;
			this.phone = phone;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rollno[]= {1,2,3,4};
		String name[]= {"Deepali","Kavita","Prasad","sneha"};
		int marks[]= {100,99,93,94};
		long phone[]= {9604753245L,9822526131L,8787685468L,9078906785L};
		
		CustomArrayList custom=new CustomArrayList();
		
		custom.addValues(rollno,name,marks,phone);
	}

	private void addValues(int[] rollno, String[] name, int[] marks, long[] phone) {
		// TODO Auto-generated method stub
		ArrayList<Data> list=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(new Data(rollno[i],name[i],marks[i],phone[i]));
		}
		
		printValues(list);
	}

	private void printValues(ArrayList<Data> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			Data data=list.get(i);
			
			System.out.println(data.rollno+" "+data.marks+" "+data.name+" "+data.phone);
		}
		
	}
	
	
	
	

}
