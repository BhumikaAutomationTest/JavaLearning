
public class Grade {
	
	public static void main (String args[]) {
		int marks=50;
		if(marks<100) {
			if(marks>=90) {
				System.out.println("It is Grade A.........");
			}else if(marks>70&&marks<90 ) {
				System.out.println("It is Grade B........");
			}else if (marks>50 && marks<=70 ) {
				System.out.println("It is Grade C..........");
			}else {
				System.out.println("It is failed");
			}
		}
		else {
			System.out.println("Invalid marks...");
		}
			
				
	}

}
