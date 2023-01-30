package method;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAverage();
		getAverage(30,40,50);
		getAverage(20,10,40);
		

	}
	
	static void getAverage()
	{
		int a=20,b=30,c=50,res;
		res=(a+b+c)/3;
		System.out.println("number one is "+a);
		System.out.println("number second is "+b);
		System.out.println("number third is "+c);
		System.out.println("number average is "+res);
	}
	
	static void getAverage(int a, int b, int c)
	{
		int res=(a+b+c)/3;
		System.out.println("number one is "+a);
		System.out.println("number second is "+b);
		System.out.println("number third is "+c);
		System.out.println("number average is "+res);
	}

}
