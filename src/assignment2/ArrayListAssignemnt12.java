package assignment2;

import java.util.ArrayList;

public class ArrayListAssignemnt12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list =new ArrayList<Integer>();
		list.add(400);
		list.add(100);
		list.add(200);
		list.add(50);
		list.add(1000);
		list.add(300);
		list.add(550);
		for(int i=0;i<list.size();i++) {
			System.out.println("Value is " + " "+list.get(i)+ " "+ "index" +" "+i);
		}
	}

}
