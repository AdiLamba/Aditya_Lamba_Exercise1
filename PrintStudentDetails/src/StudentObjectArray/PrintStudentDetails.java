package StudentObjectArray;
public class PrintStudentDetails {
	
	/* Array of objects - java example: printing studentDetails
	 * 	project - share to github : collabroation tool, tracking changes keep history - version control software
	 *  char [] reverse = new char [word.length()] : -reverse word
	 * print 3 students details - name, age and store in an array, then print.
	 * 
	 * local repository in laptop: 1. initialize version, 2. gitconfig file open global file config
	 * , 3. git igrnore (need for everyfile,
	 * create new empty file under other, to go .gitignore.io? 
	 * 
	 */

	public static void main(String[] args) {
		
	//Student is not a primitive data type, its a class, used to store objects in the array.	
	Student[] list = new Student[3];
		 
	Student stu1 = new Student(); 
	stu1.setName("John");
	stu1.setAge(20);
	list[0] = stu1;
	
	System.out.println(list[0].getName() + list[0].getAge());
	
	Student stu2 = new Student();
	Student stu3 = new Student();
		

	}

	private static void stu1(String name, int age) {
		
		name = "John";
		
		age = 20;
		
	}

}
