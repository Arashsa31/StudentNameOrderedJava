/**
 * @author Arash
 *
 */

public class Person {
	
	//attribute
	protected String name;
	
	//constructor
	public Person() {
		name = "No name";
	}

	//overloaded constructor
	public Person(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return overrides toString
	 */
	public String toString() {
		return "Name: " + name;
	}

	/**
	 * @param anotherPerson
	 * @return true if same name
	 */
	public boolean isSame(Person anotherPerson) {
		return anotherPerson.name.equalsIgnoreCase(this.name);
	}
}
