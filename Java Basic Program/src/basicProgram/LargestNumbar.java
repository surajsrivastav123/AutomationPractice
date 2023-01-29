package basicProgram;

public class LargestNumbar {

	public static void main(String[] args) {
		biggestNumber(10,20,30);
		biggestNumber(40,80,50);

	}
	
	static void biggestNumber(int num1,int num2,int num3) {
	
		if(num1>num2 && num1>num3) {
			System.out.println("largest number is num1 "+num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("largest number is num2 "+num2);
		}
		else {
			System.out.println("largest number is num3 "+num3);
		}
		
	}

}
