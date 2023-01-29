package basicProgram;

public class MultiplyTwoFloatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiple(20.50f,10.50f);

	}
	static void multiple(float num1,float num2) {
		float res=num1*num2;
		System.out.println("Number one is "+num1);
		System.out.println("Number two is "+num2);
		System.out.println("Floating multiplication is "+res);
	}

}
