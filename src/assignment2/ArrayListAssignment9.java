package assignment2;

import java.util.ArrayList;

public class ArrayListAssignment9 {

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
		System.out.println("Array list before swaping " +list);
		int swapindex1=2;
		int swapindex2=5;
		for (int i=0;i<list.size();i++) {
			if(swapindex1==i){
			int tempValue=list.get(i);
			list.set(i,list.get(swapindex2));
			list.set(swapindex2, tempValue);
			break;
			}
		}
		System.out.println("Array List after swaping " +list);
	}

}
