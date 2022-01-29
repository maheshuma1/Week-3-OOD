package facade;
import command.*;

public class PorterFacade {
	BermudaBagCommand bermudaBagCommand;
	BoxClutchCommand boxClutchCommand;
	BucketBagCommand bucketBagCommand;
	Porter porter;
	public PorterFacade(Porter porter, BermudaBagCommand bermudaBagCommand, BoxClutchCommand boxClutchCommand,
			BucketBagCommand bucketBagCommand) {
		this.bermudaBagCommand = bermudaBagCommand;
		this.boxClutchCommand = boxClutchCommand;
		this.bucketBagCommand = bucketBagCommand;
		this.porter = porter;
	}
	
	public void produceBermudaBag() {
		System.out.println("Producing Bermuda Bag");
		porter.setCommand(bermudaBagCommand);
		porter.createBermudaBag();
	}
	public void produceBoxClutch() {
		System.out.println("Producing BoxClutch");
		porter.setCommand(boxClutchCommand);
		porter.createBoxClutch();
	}
	public void produceBucketBag() {
		System.out.println("Producing Bucket Bag");
		porter.setCommand(bucketBagCommand);
		porter.createBucketBag();
	}
}
