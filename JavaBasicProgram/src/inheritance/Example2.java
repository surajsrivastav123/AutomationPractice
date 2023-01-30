package inheritance;

class Testing10
{
	void callingFromVoda()
	{
		System.out.println("I am  calling from Vodafone");
	}
	
}


class Testing20 extends Testing10
{
	void callingFromIdea()
	{
		System.out.println("I am calling from Idea");
	}
}

class Testing30 extends Testing20
{
	void callingFromAirtel()
	{
		System.out.println("I am calling from airtel");
	}
}
public class Example2 extends Testing30 {
	void display() {
		System.out.println("I am calling");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 A1=new Example2();
		A1.display();
		A1.callingFromVoda();
		A1.callingFromIdea();
		A1.callingFromAirtel();
		

	}

}
