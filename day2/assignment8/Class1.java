package day2.assignment8;

public class Class1 {
	public int i =22;
	public int j = 14000;
	public boolean k;
	public boolean l;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =22;
		int j = 14000;
		Class1 class1 = new Class1();
		boolean k = class1.method1(i);
		boolean l = class1.method2(j);
		if(k == true && l == true) {
			System.out.println("Is a new employee");
		}
		else {
			System.out.println("Is not a new employee");
		}
		
		

	}
	
	public boolean method1(int i) {
		if(i>20 && i<30) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean method2(int j) {
		if(j>=14000 && j<20000) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
