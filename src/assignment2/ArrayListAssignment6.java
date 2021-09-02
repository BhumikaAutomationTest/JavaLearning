package assignment2;

import java.util.ArrayList;

public class ArrayListAssignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list =new ArrayList<Integer>();
		list.add(400);
		list.add(100);
		list.add(200);
		list.add(50);
		int searchValue=600;
		boolean flag=false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(searchValue)){
				System.out.println("Search value matched at index ->" +i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Search value is not found in list");
		}
	}
	

}
