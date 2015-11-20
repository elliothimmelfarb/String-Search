/**
 * 
 */
package stringSearches;


/**
 * Searches a string for a substring and returns the number of times it was found. This search is not case sensitive.
 * 
 * @author Elliot Himmelfarb
 *
 */
public class StringSearch {
	
	private String input = ""; //the string to be searched
	private String target = ""; //the string to be found
	private int timesFound = 0; //the number of times the substring was found
	
	
	// Constructors ////////////////////////////////////////////////
	
	public StringSearch() {
		
	}
	
	public StringSearch(String input, String target) {
		timesFoundSearch(input, target);
	}
	
	
	// Methods ////////////////////////////////////////////////////////
	
	/**
	 * Returns an int of how many times the target was found in the input String
	 * @param input
	 * @param target
	 * @return number of times the target String was found inside the input String
	 */
	public int timesFoundSearch(String input, String target) {
		
		this.input = input;
		this.target = target;
		int timesFound = 0;
		
		for (int iii = 0; iii < (input.length() - (target.length() -1)); iii++) { 
			if (input.substring(iii, (iii+target.length())).equalsIgnoreCase(target)) {
				timesFound++;
			}
		}
		return timesFound;
	}
	
	// Setters and Getters ////////////////////////////////////////////////////
	

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getTimesFound() {
		return timesFound;
	}
}
