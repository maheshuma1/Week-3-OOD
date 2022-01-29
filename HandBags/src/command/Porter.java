package command;

public class Porter {
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	public void createBermudaBag() {
		this.command.execute();
	}
	public void createBoxClutch() {
		this.command.execute();
	}
	public void createBucketBag() {
		this.command.execute();
	}
}
