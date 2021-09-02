package assignment2;

import java.util.ArrayList;

public class ArrayListAssignment8 {
// extract a portion of a array list.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color=new ArrayList<String>();
		color.add("Red");
		color.add("Pink");
		color.add("White");
		color.add("Black");
		color.add("Yellow");
		int stratIndex=1;
		int lastIndex=3;
		int j=stratIndex;
		ArrayList <String> subList=new ArrayList<String>();
		if(stratIndex>=0 && lastIndex<color.size()) {
			for(int i=0;i<color.size();i++) {				
				if(i>=stratIndex && i<=lastIndex) {
					subList.add(color.get(j));
					j++;
					}
		}
			System.out.println("Sub list value is " +subList);	
		}else {
			System.out.println("Invalid start index or end index");
		}
		

	}

}
