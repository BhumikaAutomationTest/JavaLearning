package inheritance;

public class AddmisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling method using object and reference of IITBombay class
		IITBombay admin=new IITBombay();
		admin.bachelorOfEngineering();//Overridden method
		admin.bachelorOfArts();//Inherited method
		admin.bachelorOfcommerce();//Inherited method
		admin.bachelorOfComputerScience();//Child class method
		admin.bachelorOfTechnology();//Child class method
		
		System.out.println("-------------------------");
		
		//Calling method using object of class IITBomaby using reference variable of University
		//Here we can only call parent class method. We can't call child class method.Before calling method its checks reference type.
		//Also know as up casting
		University admin1=new IITBombay();
		admin1.bachelorOfEngineering();//Parent class method
		admin1.bachelorOfcommerce();//Parent class method
		admin1.bachelorOfArts();//Parent class method

		//Calling method using object of class University using reference variable of IITBombay		
		//Also know as down casting. Compile time it will not give error.But run time it will give error class cast exception
		System.out.println("-------------------------");
		/*IITBombay admin2=(IITBombay)new University();
		admin2.bachelorOfArts();
		admin2.bachelorOfcommerce();
		admin2.bachelorOfComputerScience();
		admin2.bachelorOfEngineering();
		admin2.bachelorOfTechnology();*/
	}

}
