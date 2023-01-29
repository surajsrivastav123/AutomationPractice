package basicProgram;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,num=346;
		System.out.println("Number is "+num);
		while(num>0)
		{
			num=num/10;
			++count;
		}
		System.out.println("digit count is "+count);
		
	}

}
