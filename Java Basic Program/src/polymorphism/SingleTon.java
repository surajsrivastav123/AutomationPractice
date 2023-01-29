package polymorphism;

class Testing{
	
	private Testing() {
		System.out.println("I am Testing class of constructor");
	}
	static Testing t1=new Testing();
	public static Testing getInstanceOfTesting() {
		return t1;
		
	}
	
	void calling() {
		System.out.println(" calling is getting excuted");
	}
}

public class SingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Testing t1= Testing.getInstanceOfTesting();
	t1.calling();

	}

}

