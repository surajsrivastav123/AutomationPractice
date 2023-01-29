package blocks;

public class StaticBlock {
	static{//when we need to add some info before main method then used static block
		System.out.println("I am a Static block");
	}
	{////when we need to add some info before creating object then used non static block
		System.out.println("I am a non static block");
	}
	void display() {
		System.out.println("I am class of object");
	}
	public static void main(String[] args) {
		System.out.println("Program is start");
		StaticBlock obj=new StaticBlock();
		obj.display();
		System.out.println("Program edd");
		

	}

}
