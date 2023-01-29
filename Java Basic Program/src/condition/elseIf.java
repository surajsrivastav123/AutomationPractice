package condition;

public class elseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=90;
		if (mark<=50)
		{
			System.out.println("mark is fail");
		}
		else if (mark>50 && mark<=60)
		{
			System.out.println("mark is C grade");
		}
		else if (mark>60 && mark<=70)
		{
			System.out.println("mark is B grade");
		}
		else if (mark>70 && mark<=85)
		{
			System.out.println("mark is A grade");

	}
	else if (mark>85 && mark<100)
	{
	System.out.println("mark is A+ grade");	
	}
	else
	{
		System.out.println("Invalid");
	}

}
}
