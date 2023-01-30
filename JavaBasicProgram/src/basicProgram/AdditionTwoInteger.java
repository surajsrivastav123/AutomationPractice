package basicProgram;

public class AdditionTwoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(15,35);
		addition(30,45);
		AdditionTwoInteger obj=new AdditionTwoInteger();
		obj.addition1(45,50);
		obj.addition1(75,50);
		addition3(30,30);
		addition3(20,20);
		obj.addition4(40, 40);
		obj.addition4(50, 50);
		

	}
	
	static void addition(int num1, int num2)//access static method through class name method
	{
		int res=num1+num2;
		System.out.println("Number one is "+num1);
		System.out.println("Number two is "+num2);
		System.out.println("Addidtion of two integert is "+res);
		
	}

	void addition1(int num1,int num2) {//access non static method through object
		int res=num1+num2;
		System.out.println("Number one is "+num1);
		System.out.println("Number two is "+num2);
		System.out.println("Addidtion1 of two integert is "+res);
		
	}
	static int addition3(int num1,int num2) {//static method through return value
		int res=num1+num2;
		System.out.println("Number one is "+num1);
		System.out.println("Number two is "+num2);
		System.out.println("Addidtion3 of two integert is "+res);
		return res;
		
	}
	int addition4(int num1,int num2) {//non static method through return value
		int res=num1+num2;
		System.out.println("Number one is "+num1);
		System.out.println("Number two is "+num2);
		System.out.println("Addidtion4 of two integert is "+res);
		return res;
		
	}
}

