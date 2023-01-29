package string;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		String s1="Suraj";
		String s2="Payal";
		String s3="Suraj";
System.out.println(s1+"\n"+s2+"\n"+s3);
System.out.println("comapre s1 & s2 object based on address "+s1.equals(s2));
System.out.println("comapre s1 & s3 object base on address "+s1.equals(s3));
System.out.println("comapre s2 & s3 object base on address "+s2.equals(s3));
System.out.println("comapre s1 & s3 object base on address "+(s1==s3));
System.out.println("comapre s1 & s3 object base on address "+(s1==s2));
System.out.println("comapre s1 & s3 object base on address "+(s2==s3));

String s4=" My name is Suraj";
System.out.println("String s4 is "+s4);
System.out.println(s4.length());
for(int i=0;i<s4.length();i++) {
	System.out.print(s4.charAt(i));
}
String name;
Scanner sc=new Scanner(System.in);
System.out.println(" enter your name ");
name=sc.next();
System.out.println("your name is "+name);
String[] a1=new String[5];
for(int t=0; t<a1.length;t++) {
	System.out.println("Enter your name");
	a1[t]=sc.next();
}
for(String s6:a1) {
	System.out.println(s6);
}
	}

}
