package command;

public class BoxClutchCommand implements Command {
	BoxClutch boxClutch;
	
	public BoxClutchCommand(BoxClutch boxClutch) {
		this.boxClutch = boxClutch;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.boxClutch.createSmallHandle();
		this.boxClutch.createSmallRectangular();
		this.boxClutch.createTrendyLook();
	}
	

}
