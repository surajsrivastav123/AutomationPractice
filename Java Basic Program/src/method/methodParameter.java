package method;

public class methodParameter {
	public static void main(String[] args)
	{
		addTwoNumber(10,30);
		addTwoNumber(20,30);
		addTwoNumber(40,30);
	}
	
	static void addTwoNumber(int num1, int num2)
	{
		//num1=10;
		//num2=20;
		int res=num1+num2;
		System.out.println("num1 is "+num1);
		System.out.println("num2 is "+num2);
		System.out.println("result is "+res);
	}

}
