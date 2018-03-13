package Tasks;
import Status;

/**
 * Single generic Task
 */

/**
 * @author Ari Lacanienta
 *
 */
public class Task extends AbstractTask {
	public boolean finished;
	
	Task() {
		super();
		currentStatus = Status.Incomplete;
	}
	
	Task(AbstractTask t) {
		ID = TotalID++;
		name = t.name;
		description = t.description;
		currentStatus = t.currentStatus;
	}	
}