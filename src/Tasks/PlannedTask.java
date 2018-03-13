package Tasks;

/**
 * Unexecuted task in a schedule
 */

/**
 * @author 18alacanienta
 *
 */
public class PlannedTask extends AbstractTask {
	int startTime;
	int endTime;
	int length;
	// Expired?
	
	/**
	 * 
	 */
	public PlannedTask() {
		startTime = 0;
		endTime = 0;
		length = 0;
	}
	
	public void setStart(int s) {}
	
	public void setEnd(int e) {}
	
	public void setLength(int l) {}
}
