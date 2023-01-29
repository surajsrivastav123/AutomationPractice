package constuctor;

public class Example1 {
	int age;
	double salary;
	Example1(){
		System.out.println("Constuctor is zero parameterized");
	}
	Example1(int age){
		System.out.println("Constuctor is int parameterized "+age);
	}

	public static void main(String[] args) {
		
		Example1 obj=new Example1();
		System.out.println("age is "+obj.age);
		System.out.println("salary is "+obj.salary);
		Example1 obj1=new Example1(25);
		

	}

}


