package inheritance;

public class StateUniversity extends University {
	@Override
	public void bachelorOfEngineering() {
		System.out.println("StateUniversity---- bachelorOfEngineering");
	
	}
	@Override
	public void bachelorOfcommerce() {
		System.out.println("StateUniversity---- bachelorOfcommerce");
	}
	@Override
	public void bachelorOfArts() {
		System.out.println("StateUniversity---- bachelorOfArts");
	}
	public void bachelorOfComputerApplication() {
		System.out.println("StateUniversity---- bachelorOfComputerApplication");
	}
	public void masterOfComputerApplication() {
		System.out.println("StateUniversity---- masterOfComputerApplication");
	}
}
