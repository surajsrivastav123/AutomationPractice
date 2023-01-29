package basicProgram;

public class LeapYear {

	public static void main(String[] args) {
		year(2020);
		year(2000);
		year(2028);
		year(1700);
		year(2021);
		

	}
	static void year(int num1) {
		System.out.println("year is "+num1);
		
		if (num1%4==0 && num1%100!=0 || num1%400==0) {
			System.out.println("year is leap year");
		}
		else {
			System.out.println("year is not leap year");
		}
	
}

}
