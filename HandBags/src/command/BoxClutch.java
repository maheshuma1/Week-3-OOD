package command;

public class BoxClutch {
	String name;
	public BoxClutch() {
		this.name = "Bermuda Bag";
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void createTrendyLook() {
		System.out.println("Polishing bag for trendy look");
	}
	public void createSmallRectangular() {
		System.out.println("Create small and renctangular box");
	}
	public void createSmallHandle() {
		System.out.println("Create a small handle for bag");
	}
}
