package assignment2;

import java.util.ArrayList;

public class ArrayListAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color=new ArrayList<String>();
		color.add("Red");
		color.add("Pink");
		color.add("White");
		color.add("Black");
		color.add("Yellow");
		System.out.println("List value before deleteing value " +color);
		color.remove(2);
		System.out.println("List value after removing value at index 2 " +color);
		

	}

}
