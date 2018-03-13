package Tasks;
/**
 * Template for ALL tasks
 */

/**
 * @author Ari Lacanienta
 */
public abstract class AbstractTask implements TaskFace{
	public static int TotalID = 0001;
	public int ID;
	public String name;
	public String description;
	public Status currentStatus;
	
	AbstractTask() {
		ID = TotalID++;
		name = "";
		description = "";
		currentStatus = Status.NoProcess;
	}
	
	public void setName(String n) {name = n;}
	
	public void setDescription(String d) {description = d;}
	
	public void setStatus(Status s) {currentStatus = s;}

	public String toString() {
		String str = name +"\n"
				+"TASK: " + ID + "\n"
				+ "Description: " + description + "\n"
				+ "Status: " + currentStatus;
		return str;
	}
	
	public int getID() {return ID;}

	public String getName() {return name;}

	public String getDescription() {return description;}
	
	public Status getStatus() {return currentStatus;}

}
