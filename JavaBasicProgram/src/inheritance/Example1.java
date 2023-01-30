package inheritance;

class Testing1
{
	void callingFromVoda()
	{
		System.out.println("I am  calling from Vodafone");
	}
	
}


class Testing2
{
	void callingFromIdea()
	{
		System.out.println("I am calling from Idea");
	}
}

class Testing3
{
	void callingFromAirtel()
	{
		System.out.println("I am calling from airtel");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing1 A1=new Testing1();
		A1.callingFromVoda();
		Testing2 A2=new Testing2();
		A2.callingFromIdea();
		Testing3 A3=new Testing3();
		A3.callingFromAirtel();

	}

}
