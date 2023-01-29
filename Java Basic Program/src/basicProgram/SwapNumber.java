package basicProgram;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapUsingThird(20,40);
		//swapUsingThird(10,30);
		swap(10,20);
		swap(23,25);

	}
	static void swapUsingThird(int num1,int num2) {
		System.out.println("number 1 is "+num1);
		System.out.println("number two is "+num2);
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("swaping number is "+num1+" "+num2);
		
	}
	static void swap(int num1,int num2) {
		System.out.println("number one is "+num1);
		System.out.println("number two is "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("number one is "+num1);
		System.out.println("number two is "+num2);
	}

}
