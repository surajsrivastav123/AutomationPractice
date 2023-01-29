package basicProgram;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0,num=123,rem;
		while(num!=0)
		{
			
			rem=num%10;//rem=123%10=3,rem=12%10=2,rem =1/10=1
			rev=rev*10+rem;//0*10+3=3, rev=3*10+2=32, rev= 32*10+1=321
			num=num/10;//123/10=12,12/10=1, 1/10=0
			//System.out.println(rev);
		}
		System.out.println(rev);

	}

}
