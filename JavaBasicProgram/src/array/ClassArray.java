package array;

class Demo{
	int age;
	
	Demo(){
		System.out.println("I am empty constructor");
	}
	Demo(int age){
		this.age=age;
		System.out.println("I am age is "+age);
	}
	void display() {
		System.out.println("I am display of age");
		System.out.println("age value is"+age);
	}
}

public class ClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo GetArray[]=new Demo[2];
		GetArray[0]=new Demo();
		GetArray[1]=new Demo(25);
		
		GetArray[0].display();
		GetArray[1].display();
		
		

	}

}
