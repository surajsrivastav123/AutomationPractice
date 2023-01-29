package string;

public class Example2 {

	public static void main(String[] args) {
		String s1=new String("Suraj");
		String s2=new String("payal");
		String s3=new String("Suraj");
System.out.println(s1+"\n"+s2+"\n"+s3);
System.out.println("comapre s1 & s2 object based on address "+s1.equals(s2));
System.out.println("comapre s1 & s3 object base on address "+s1.equals(s3));
System.out.println("comapre s2 & s3 object base on address "+s2.equals(s3));
System.out.println("comapre s1 & s3 object base on address "+(s1==s3));
System.out.println("comapre s1 & s3 object base on address "+(s1==s2));
System.out.println("comapre s1 & s3 object base on address "+(s2==s3));


	}

}
