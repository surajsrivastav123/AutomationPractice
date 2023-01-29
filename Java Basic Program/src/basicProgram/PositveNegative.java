package basicProgram;

public class PositveNegative {

	public static void main(String[] args) {
		number(4);
		number(-2);
		number(0);
	}
	static void number(int num) {
		System.out.println("number is "+num);
		if(num>0) {
			System.out.println("Number is positive "+num);
		}
		else if(num<0) {
			System.out.println("Number is Negative "+num);
		}
		else {
			System.out.println("Number is zeor "+num);
		}
	}

}
