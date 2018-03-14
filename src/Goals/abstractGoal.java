/**
 * 
 */
package Goals;

/**
 * @author Ari
 *
 */
public abstract class abstractGoal implements Goal {
	private String name;
	private String description;
	private String ID;
	private static int IDTotal = 0;
	private double target;
	private double progress;
	private String units;
	private double completion;
	private goalStatus status;
	// TODO: Rewards
	
	abstractGoal(String n, String d, double g, String u) {
		name = n;
		description = d;
		ID = "G" + IDTotal++ + u.charAt(0);
		target = g;
		progress = 0;
		units = u;
		completion = 0;
		status = goalStatus.Incomplete;
	}
	
	private void checkCompletion() {
		if (completion >= 100) {
			status = goalStatus.Complete;
		} else {
			status = goalStatus.Incomplete;
		}
	}
	
	/**
	 * Manually set the status of a goal
	 * @param s The status to set the goal to.
	 */
	public void setStatus(goalStatus s) {status = s;}

	/**
	 * Percentage goal change
	 * @param percent percent change in completion
	 */
	public void modCompletion(double percent) {
		completion += percent;
		progress = (completion/100) * target;
		checkCompletion();
	}

	/**
	 * Quantifiable change in progress
	 * @param amount the amount to change by.
	 */
	public void modProgress(double amount) {
		progress += amount;
		completion = (progress/target) * 100;
		checkCompletion();
	}
	
	/*
	 * Unique identifier
	 * @return the Goal's unique goalID.
	 */
	public String getID() {return ID;}

	/* (non-Javadoc)
	 * @see Goals.Goal#getStatus()
	 */
	public goalStatus getStatus() {return status;}

	/**
	 * @return the percent completion of the goal
	 */
	public double getProgress() {return progress;}
	
	public String toString() {
		String str = "Goal:\t" + name + "\tStatus:" + status + "\n"
				+ "ID:\t" + ID +"\n"
				+ description + "\n"
				+ "Target:\t" + target + " " + units + "\n"
				+ "Progress:\t" + progress + " " + units + "\n"
				+ "Completion:\t" + completion + "\n";
	}

}
