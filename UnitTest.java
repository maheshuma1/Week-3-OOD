package test;
import command.*;
import facade.*;
public class UnitTest {

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
		
		if(porterFacade != null) {
			
			System.out.println("Facade initialized correclty");
			System.out.println();
		}
		else {
			System.out.println("Facade failed to initialize");
			
		}
		
		porter.setCommand(bucketBagCommand);
		try {
			porter.createBucketBag();
			System.out.println();
			System.out.println("Command execution Successful");
		}
		catch (Exception e) {
			
			System.out.println("Command execution failed");
		}
		
		
	}

}
