/**
 * 
 */
package stringSearches;


/**
 * Searches a string for a substring. This search is case sensitive.
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
		this.input = "";
		this.target = "";
		this.timesFound = 0;
	}
	
	public StringSearch(String input, String target) {
		this.input = input;
		this.target = target;
		this.timesFound = 0;
	}
	
	
	// Methods ////////////////////////////////////////////////////////
	
	/**
	 * Returns an int of how many times the target was found in the input String
	 * @param input
	 * @param target
	 * @return number of times the target String was found inside the input String
	 */
	public int timesFoundSearch(String input, String target) {
		for (int iii = 0; iii < input.length(); iii++) { 
			if (input.substring(iii, (iii + (target.length() - 1))).equalsIgnoreCase("elliot")) {
				this.timesFound++;
			}
		}
		return this.timesFound;
	}
	
	
	// Getters and Setters ////////////////////////////////////////////////
	
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
