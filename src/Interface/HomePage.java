package Interface;

import inheritance.PageDesign;

public final class HomePage extends PageDesign implements WebPage,MobilePage {

	@Override
	public void validateHTML() {
		System.out.println("Home Page----validateHTML");
		
	}

	@Override
	public void validateDOM() {
		System.out.println("Home Page----validateDOM");
		
	}

	@Override
	public void setScreenSizeBrowser() {
		System.out.println("Home Page----setScreenSizeBrowser");
		
	}

	@Override
	public void getWindowResoulation() {
		System.out.println("Home Page----getWindowResoulation");
		
	}

	@Override
	public void setMobileScreenSize() {
		System.out.println("Home Page----setMobileScreenSize");
		
	}

	@Override
	public void getMobileScreenSize() {
		System.out.println("Home Page----getMobileScreenSize");		
	}
	@Override
	public void createFrame() {
		System.out.println("Home page ------createFrame");
	}

}
