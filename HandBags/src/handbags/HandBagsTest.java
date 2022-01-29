package handbags;
import command.*;
import facade.*;
public class HandBagsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BermudaBag bermudaBag = new BermudaBag();
		BoxClutch boxClutch = new BoxClutch();
		BucketBag bucketBag = new BucketBag();
		
		BermudaBagCommand bermudaBagCommand = new BermudaBagCommand(bermudaBag);
		BoxClutchCommand boxClutchCommand = new BoxClutchCommand(boxClutch);
		BucketBagCommand bucketBagCommand = new BucketBagCommand(bucketBag);
		Porter porter = new Porter();
		
		PorterFacade porterFacade = new PorterFacade(porter, bermudaBagCommand, boxClutchCommand, bucketBagCommand);
		
		porterFacade.produceBermudaBag();
		
		System.out.println();
		
		porterFacade.produceBoxClutch();
		
		System.out.println();
		
		porterFacade.produceBucketBag();
	}

}
