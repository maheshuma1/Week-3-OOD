package command;

public class BermudaBag {
	String name;
	public BermudaBag() {
		this.name = "Bermuda Bag";
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void createWoodenHandle() {
		System.out.println("Create wooden handle");
	}
	public void createColors() {
		System.out.println("Create All sorts of colors");
	}
	public void createPatterns() {
		System.out.println("Create patterns for bag");
	}
}
