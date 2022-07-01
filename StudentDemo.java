package Question7;

import java.util.Arrays;

/**
 * @author Arash
 *
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student[] studentArray = new Student[5];
		
		studentArray[0] = new Student("Joana", 7561);
		studentArray[1] = new Student("Paula", 3468);
		studentArray[2] = new Student("Kathy", 2648);
		studentArray[3] = new Student("Eric" , 9786);
		studentArray[4] = new Student("Jack" , 5647);
		
		Arrays.sort(studentArray);
		
		for (Student s : studentArray) {
			System.out.println(s.toString());
			System.out.println();
		}
	}
}
