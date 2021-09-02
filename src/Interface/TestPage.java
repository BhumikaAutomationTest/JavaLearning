package Interface;

import inheritance.PageDesign;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using child class object and reference will be able to access all the methods of interfaces and parent class
		HomePage obj=new HomePage();
		obj.validateHTML();
		obj.validateDOM();
		obj.setScreenSizeBrowser();
		obj.setMobileScreenSize();
		obj.getWindowResoulation();
		obj.getMobileScreenSize();
		obj.createFrame();
		obj.creatTable();
		System.out.println("-------------------------------------");
		//Using grand parents reference variable and object of child class will be able to access grand parents interface methods
		W3C obj1=new LoginPage();
		obj1.validateDOM();
		obj1.validateHTML();
		System.out.println("-------------------------------------");
		//Using parent interface reference variable and object of child class will be able to access grand and parent interface methods.
		WebPage obj2=new HomePage();
		obj2.validateHTML();
		obj2.validateDOM();
		obj2.setScreenSizeBrowser();
		obj2.getWindowResoulation();
		System.out.println("-------------------------------------");
		//Using parent interface reference variable and object of child class will be able to access grand and parent interface methods.
		MobilePage obj3=new LoginPage();
		obj3.validateHTML();
		obj3.validateDOM();
		obj3.setMobileScreenSize();
		obj3.getMobileScreenSize();
		System.out.println("-------------------------------------");
		//using parent class reference variable and parent class is not implementing any interface ,will be able to access only parent class methods.
		PageDesign obj4=new HomePage();
		obj4.createFrame();
		obj4.creatTable();
		
			
			
		

	}

}
