package day2.assignment9;

public class Student {
	private static int id = 550;
	private int studentId;
	private char studentType;
	private String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student(char studentType, String fName,String lName) {
		super();
		this.studentId = id;
		this.studentType = studentType;
		this.studentName = fName+" "+lName;
	}
	public Student() {
		super();
		this.studentId =id++;
	}
	public static void main(String[] args) {
		Student studentOne = new Student('D',"Bony","Thomas");
		studentOne.displayDetails(studentOne);
	}
	
	public void displayDetails(Student stud) {
		System.out.println("The student name is" + stud.studentName);
	}
	
	

}
