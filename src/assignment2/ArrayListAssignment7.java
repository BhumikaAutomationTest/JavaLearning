package assignment2;

import java.util.ArrayList;

public class ArrayListAssignment7 {
//Reverse Array list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list =new ArrayList<Integer>();
		list.add(400);
		list.add(100);
		list.add(200);
		list.add(50);
		int j=list.size()-1;
		System.out.println("List before reverse ----" +list);
		for(int i=0;i<j;i++) {
			int tempValue=list.remove(j);
			list.add(i,tempValue);
			
		}
		System.out.println("Reverse list is -- " +list);
		
	}

}
