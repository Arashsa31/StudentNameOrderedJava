/**
 * @author Arash
 * 
 */

public class Student extends Person implements Comparable{

	// attribute
	protected int studentNumber;

	// constructor
	public Student() {
		super();
		studentNumber = 0;
	}

	// overloaded constructor
	public Student(String name, int studentNumber) {
		super(name);
		this.studentNumber = studentNumber;
	}

	/**
	 * @param newName
	 * @param newStudentNumber
	 */
	public void reset(String name, int studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
	}

	/**
	 * @return studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param newStudentNumber
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	/**
	 * @return overrides toString
	 */
	public String toString() {
		return super.toString() + "\n" + 
				"ID: " + studentNumber;
	}

	/**
	 * @param anotherStudent
	 * @return true if the same student
	 */
	public boolean isSame(Student anotherStudent) {
		return (anotherStudent.name.equalsIgnoreCase(this.name) && 
				anotherStudent.studentNumber == this.studentNumber);
	}

	/**
	 * @Override Comparable
	 */
	public int compareTo(Object o) {
		return this.name.compareTo(((Student) o).name);
		/**
		 * list students by their student ID number return
		 * return  this.studentNumber - ((Student) o).studentNumber;
		 * 
		 * For ordered name, can do: if ( (o != null) && (o instanceof Student)) {
		 * Student otherStudent = (Student) o; }
		 */
	}
}
