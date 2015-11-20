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
	// Constructors ////////////////////////////////////////////////
	
	public StringSearch() {
	}
	
	public StringSearch(String input, String target) {
		/*this.input = input;
		this.target = target;
		this.timesFound = 0;*/
	}
	
	
	// Methods ////////////////////////////////////////////////////////
	
	/**
	 * Returns an int of how many times the target was found in the input String
	 * @param input
	 * @param target
	 * @return number of times the target String was found inside the input String
	 */
	public int timesFoundSearch(String _input, String _target) {
		
		String input = _input;
		String target = _target;
		int timesFound = 0;
		
		for (int iii = 0; iii < (input.length() - (target.length() -1)); iii++) { 
			if (input.substring(iii, (iii+target.length())).equalsIgnoreCase(target)) {
				timesFound++;
			}
		}
		return timesFound;
	}
}
