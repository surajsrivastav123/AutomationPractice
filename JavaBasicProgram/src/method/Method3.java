package method;

public class Method3 {
	
	static int age;
	double salary;
	
	void display()
	{
		System.out.println("I am dislpay() ");
	}
	static void print()
	{
		System.out.println("I am Print");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age=50;
		System.out.println("age is "+Method3.age);
		Method3 A1=new Method3();
		System.out.println("Salary is "+A1.salary);
		A1.display();
		age =100;
		System.out.println("age is "+Method3.age);
		A1.salary=25000;
		System.out.println("Salary is "+A1.salary);
		
		
		

	}

}
