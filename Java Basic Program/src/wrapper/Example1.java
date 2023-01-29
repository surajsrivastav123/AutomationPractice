package wrapper;

public class Example1 {

	public static void main(String[] args) {
		int age=33;
		System.out.println("int age "+age);
		Integer a= new Integer(age);//explicity boxing
		System.out.println("boxing a is "+a);
		Integer s =35;//auto boxing
		System.out.println("auto boxing "+s);
		int b1=s.intValue();//unboxing
		System.out.println("unboxing "+ b1);
		System.out.println("age = a "+(age==a));
		System.out.println("s=b1 "+s.equals(b1));
		

	}

}
