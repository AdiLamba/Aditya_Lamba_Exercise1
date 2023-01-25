package StudentObjectArray;
public class Student {

	/*
	 * right cick field, refractor, encapsulation - shows getters and setters
	 * 
	 * first set private variables, then create getters and setters
	 */

	private String name;

	private int age;

	private int sid;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

}
