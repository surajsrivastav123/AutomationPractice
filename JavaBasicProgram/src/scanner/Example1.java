package scanner;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		int age;
		char grade;
		double salary;
		boolean status;
		Scanner sc= new Scanner(System.in);
		System.out.println("Age is ");
		age=sc.nextInt();
		System.out.println("Grade is ");
		grade=sc.next().charAt(0);
		System.out.println("Salary is ");
		salary=sc.nextDouble();
		System.out.println("Status is ");
		status=sc.nextBoolean();
		System.out.println("Enter your name ");
		String name=sc.next();
		System.out.println("address is");
	    String address=sc.nextLine();
		System.out.println("\n"+age+"\n"+grade+"\n"+salary+"\n"+status+"\n"+name+"\n"+address);
		
	}

}
