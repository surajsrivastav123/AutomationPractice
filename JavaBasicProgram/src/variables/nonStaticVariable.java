package variables;

public class nonStaticVariable {
	
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int age=25;
		nonStaticVariable n1=new nonStaticVariable();
		System.out.println("age is "+n1.age);
		n1.age=25;
		System.out.println("age is updated "+n1.age);
		
	

	}

}
