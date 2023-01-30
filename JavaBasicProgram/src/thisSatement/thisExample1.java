package thisSatement;

class ThisKeyword
{
	int rollno;
	float fee;

	
	ThisKeyword(int rollno)
	{
		this.rollno=rollno;
}
	ThisKeyword(int rollno, float fee)
	{
		this(40);//call another constructor
		this.rollno=rollno;//check local & global variable name when variables names are same.
		this.fee=fee;
		
	}
	
	void display() {
		System.out.println("Roll no is "+rollno+" Fee is "+fee);
	}
	}

public class thisExample1 {
	
	public static void main(String[] args) {
		
		ThisKeyword b1=new ThisKeyword(40);
		b1.display();
		ThisKeyword c1=new ThisKeyword(50,60.25f);
		c1.display();
		
	}
		// TODO Auto-generated method stub
	}
	
