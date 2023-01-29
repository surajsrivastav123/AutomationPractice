package finalKeyword;

class Example3 {
	
	final int age=25;
	double salary=2500.00;
	
	void run() {
		System.out.println("age is "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example3 obj=new Example3();
		obj.run();
		System.out.println("age is "+obj.salary);
		
		

	}

}

/**
* anything declared with final keyword known as constant
* any variable declared with final keyword should initialize at the same time
*
*/