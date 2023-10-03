package day2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'I';
		switch(ch) {
		case 'A':
			System.out.println("Marks Range: 80-100");
			break;
		case 'B':
			System.out.println("Marks Range: 73-79");
			break;
		case 'C':
			System.out.println("Marks Range: 65-72");
			break;
		case 'D':
			System.out.println("Marks Range: 55-64");
			break;
		case 'E':
			System.out.println("Marks Range: <55");
			break;
		default:
			System.out.println("Grade doesn't exist");
			break;
		}
	}

}
