package day2.assignment45;

public class CourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studId = 1;
		char studType = 'L';
		Student student = new Student();
		student.setStudentId(studId);
		student.setStudentType(studType);
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		
		
		//Assignment 5
		Student stud1 = new Student();
		System.out.println(stud1.getStudentId());
		System.out.println(stud1.getStudentType());
	}

}
