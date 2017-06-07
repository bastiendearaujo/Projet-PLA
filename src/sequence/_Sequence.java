package sequence;

import exceptions.NotDoableException;
import personnages.Robot;

public interface _Sequence {

	public boolean isAction();

	public boolean isTree();

	public void execute(Robot r) throws NotDoableException;
	
	public void cancel(Robot r) throws NotDoableException;
	

}