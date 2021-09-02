package assignment2;

import java.util.ArrayList;

public class ArrayListAssignment4 {

	
	//Updating specific value in the list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list =new ArrayList<Integer>();
		list.add(400);
		list.add(100);
		list.add(200);
		list.add(50);
		System.out.println("List value before updateing " +list);
		list.set(2, 300);
		System.out.println("List value after updateing value at index 2 is " +list);
	}

}
