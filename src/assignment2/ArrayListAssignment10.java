package assignment2;

import java.util.ArrayList;

public class ArrayListAssignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list =new ArrayList<Integer>();
		list.add(400);
		list.add(100);
		list.add(200);
		list.add(50);
		list.add(1000);
		System.out.println("List value before trim" +list);
		list.trimToSize();
		System.out.println("List value after trim " +list);

	}

}
