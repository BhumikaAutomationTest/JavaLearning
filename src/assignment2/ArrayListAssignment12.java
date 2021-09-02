package assignment2;

import java.util.ArrayList;

public class ArrayListAssignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list =new ArrayList<Integer>();
		list.add(300);
		list.add(50);
		list.add(60);
		list.add(35);
		for(int i=0;i<list.size();i++) {
			System.out.println ("Value at indext "+ i +" is " +list.get(i));
		}

	}

}
