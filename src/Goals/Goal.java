package Goals;
/**
 * @author Ari Lacanienta
 *
 */
public interface Goal {
	// Mutators
	public void setStatus(goalStatus s);
	public void modCompletion(double percent);
	public abstract void setProgress();
	public void modProgress(double amount);
	// Accessors
	public String getID();
	public goalStatus getStatus();
	public double getProgress();
	public String toString();
}
