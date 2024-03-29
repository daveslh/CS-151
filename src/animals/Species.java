package animals;

import java.util.*;

public class Species {
	
	/**Instance variables	*/
	
	private String name;
	private double weight, length, height;
	private List<Species> diet;
	
	/**No-arg constructor	*/
	
	public Species() {
		name = "INPUT SPECIES NAME";
		weight = 0;
		length = 0;
		height = 0;
		diet = new ArrayList<Species>();
		
	}
	
	/** Added toString method to print Species object.	*/
	
	@Override
	public String toString() {
		return name + "\nweight: " +
			   weight + "\nlength: " +
			   length + "\nheight: " +
			   height + "\ndiet: " +
			   diet;
	}

/** Starter class file for Species class, which holds basic information (like name,
 * weight, length, and height) about the species, a constructor that initializes the variables, as well as an ArrayList of type
 * species that holds what its diet consists of (other species objects).
 */

}
