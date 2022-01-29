package command;

public class BucketBagCommand implements Command{
	BucketBag bucketBag;
	
	public BucketBagCommand(BucketBag bucketBag) {
		this.bucketBag = bucketBag;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.bucketBag.createLargeBag();
		this.bucketBag.createManySizes();
		
	}
	
}
