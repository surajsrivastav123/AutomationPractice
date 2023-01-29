package overrideInheritance;

class Animal2{
	void move() {
		System.out.println("Animal can move");
	}
	void display() {
		System.out.println("I am display of Animal2 class");
	}
}
class Dog1 extends Animal2{
	void move() {
		System.out.println("Dog can walk & run");
		display();
	}
	public void calling() {
		move();
		super.move();
		System.out.println("I am calling");
	}
}
public class Example2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dog1 a=new Dog1();
		a.calling();
		

	}

}
