package basicProgram;

public class NaturalSum {

	public static void main(String[] args) {

		int num=10;
		int sum;
		System.out.println("number is "+num);
				
		for (int i=1;i<=num;i++) {
			System.out.println(i);
			
		}
		sum=num*(num+1)/2;
		System.out.println("Natural number sum is "+sum);

	}

}
