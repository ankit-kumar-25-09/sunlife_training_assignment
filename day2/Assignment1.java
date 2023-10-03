package day2;

public class Assignment1 {
	public static void main(String args[] ){
		int intVal = 100;
		byte byteVal = (byte)intVal;
		byte max = 127;
		byte min = -128;
		int sum = max+min; //This line gives compilation error if sum is byte since the result of the addition is int and can only be stored in an int variable
		System.out.println(sum);
	}
}
