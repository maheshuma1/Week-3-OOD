package command;

public class BermudaBagCommand implements Command {
	BermudaBag bermudaBag;
	
	public BermudaBagCommand(BermudaBag bermudaBag) {
		this.bermudaBag = bermudaBag;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.bermudaBag.createWoodenHandle();
		this.bermudaBag.createColors();
		this.bermudaBag.createPatterns();
	}

}
