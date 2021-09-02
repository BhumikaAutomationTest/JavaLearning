package assignment2;

import java.util.ArrayList;

public class ArrayListAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(100);
		list.add(500);
		System.out.println("List value is ----"+list);
		list.add(0, 600);
		System.out.println("List value after inserting value at first position is ----"+list);
		list.add(5, 700);
		System.out.println("List value after inserting value at last position is ----"+list);
	}

}
