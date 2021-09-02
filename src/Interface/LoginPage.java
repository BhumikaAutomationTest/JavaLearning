package Interface;

import inheritance.PageDesign;

public final class LoginPage extends PageDesign implements WebPage,MobilePage{

	@Override
	public void validateHTML() {
		System.out.println("Login Page----validateHTML");		
	}

	@Override
	public void validateDOM() {
		System.out.println("Login Page----validateDOM");
		
	}

	@Override
	public void setScreenSizeBrowser() {
		System.out.println("Login Page----setScreenSizeBrowser");
		
	}

	@Override
	public void getWindowResoulation() {
		System.out.println("Login Page----getWindowResoulation");
		
	}

	@Override
	public void setMobileScreenSize() {
		System.out.println("Login Page----setMobileScreenSize");
		
	}

	@Override
	public void getMobileScreenSize() {
		System.out.println("Login Page----getMobileScreenSize");
		
	}
	public void createTable() {
		System.out.println("Login Page----createTable");
	}

}
