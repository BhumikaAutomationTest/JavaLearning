package Test;

public class FindString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ababcdefga";
		String[] sArray={"a","bc","cde","ga"};
		boolean flag=false;
		for(int i=0;i<sArray.length;i++) {
			if(s.contains(sArray[i])) {
				flag=true;
			}else {
				flag=false;
			}
			System.out.println(flag);
		}
		
				

	}

}
