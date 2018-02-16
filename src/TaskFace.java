/**
 * General Task Methods
 */

/**
 * @author 18alacanienta
 *
 */
public interface TaskFace {
	// Mutator methods
	public void setName(String n);
	public void setDescription(String d);
	public void setStatus(Status s);
	// Get methods
	public String toString();
	public int getID();
	public String getName();
	public String getDescription();
	public Status getStatus();
}
