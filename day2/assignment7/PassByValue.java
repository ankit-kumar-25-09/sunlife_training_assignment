package day2.assignment7;

import day2.assignment45.Student;

public class PassByValue {

	public static void main(String[] args) {
		int sid = 10;
		PassByValue passByValue = new PassByValue();
		passByValue.passByValueMethod(sid);
		System.out.println("The sid in main method is"+sid);
		Student student = new Student();
		System.out.println(student.getStudentId());
		passByValue.passTheValueStudent(student);
		System.out.println(student.getStudentId());
		//The value of student id got changed because this time we passed the reference of the object and the change is made to the object.

	}
	
	public void passByValueMethod(int sid) {
		sid = 25;
		System.out.println("The sid is "+sid);
	}
	public void passTheValueStudent(Student stud) {
		stud.setStudentId(299);
	}

}
