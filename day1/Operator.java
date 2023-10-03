package day1;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float floatVal = 3.0f;
		boolean bool1 = true;
		boolean bool2 =false;
		boolean bool3 =true;
		System.out.println("Arithmetic");
		
		if(bool1&&(bool2 && bool3)) {
			System.out.println("All True");
		}
		else {
			System.out.println("Failure");
		}
		System.out.println("Bool2 value:"+bool3);
		
		
		// Assignment 8
		int intVal = 100;
		byte byteVal = (byte)intVal;
		byte max = 127;
		byte min = -128;
		int sum = max+min; //This line gives compilation error if sum is byte since the result of the addition is int and can only be stored in an int variable
		System.out.println(sum);
		
		
		
	}

}
