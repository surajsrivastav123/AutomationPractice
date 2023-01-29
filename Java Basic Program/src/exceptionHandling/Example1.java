package exceptionHandling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		int d,e,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value ");
		 d=sc.nextInt();
		System.out.println("value d is "+d);
		System.out.println("Enter b value is ");
		 e=sc.nextInt();
		System.out.println("value e is "+e);
		try {
			c=d/e;
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("Exception handel "+obj);
			obj.printStackTrace();
			
		}
		finally {
			System.out.println("finally block excuted");
		}
		System.out.println("program End");

	}

}
