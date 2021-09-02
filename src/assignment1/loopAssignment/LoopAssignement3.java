package assignment1.loopAssignment;

public class LoopAssignement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //print 10 to 1 using for loop
		System.out.println("Printing 10 to 1 using for loop");
		for (int i=10;i>=1;i--) {
			System.out.println(i);
		}
		//print 10 to 1 using while loop
		int j=10;
		System.out.println("Printing 10 to 1 using while loop");
		while(j>=1) {			
			System.out.println(j);
			j--;
		}
		//print 10 to 1 using do while loop
		System.out.println("Printing 10 to 1 using do while loop");
		int k=10;
		do {
			System.out.println(k);
			k--;
		}while(k>=1);
	}

	
	
		
}

