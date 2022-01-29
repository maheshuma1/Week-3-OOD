package command;

public class BucketBag {
	String name;
	public BucketBag() {
		this.name = "Bucket Bag";
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void createLargeBag() {
		System.out.println("Creating Large bag that is still stylish");
	}
	public void createManySizes() {
		System.out.println("Create bag with many different sizes");
	}

}
