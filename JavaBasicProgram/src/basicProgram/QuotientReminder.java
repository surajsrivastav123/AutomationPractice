package basicProgram;

public class QuotientReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		quotientAndReminder(30,4);
		quotientAndReminder(40,6);
		
	}
	static void quotientAndReminder(int num1,int num2) {
		int quotient=num1/num2;
		System.out.println("Number one is "+num1);
		System.out.println("Number one is "+num2);
		System.out.println("Number quotient is "+quotient);
		
		int reminder=num1%num2;

		System.out.println("Number one is "+num1);
		System.out.println("Number one is "+num2);
		System.out.println("Number reminder is "+reminder);
		
	}

}
