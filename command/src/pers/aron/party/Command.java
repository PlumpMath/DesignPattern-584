package pers.aron.party;

public interface Command {
	public void execute();
	public void undo();
}
