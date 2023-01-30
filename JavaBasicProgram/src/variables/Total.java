package variables;

public class Total {
	static int empid;
	double salary;

	public static void main(String[] args) {
		int age=25;
		System.out.println("age is "+age);
		System.out.println("empid is "+Total.empid);
		Total obj=new Total();
		System.out.println("salary is "+obj.salary);
		Total.empid=251;
		obj.salary=5000;
		System.out.println("empid is "+Total.empid);
		System.out.println("salary is "+obj.salary);
	}

}
