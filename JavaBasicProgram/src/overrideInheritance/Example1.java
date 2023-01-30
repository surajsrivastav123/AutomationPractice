package overrideInheritance;

class Animal1{
	void move() {
		System.out.println("Animal can move");
	}
}
class Dog extends Animal1{
	void move() {
		System.out.println("Dog can walk & run");
	}
	void bark() {
		System.out.println("Dog can bark");
	}
}
public class Example1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Animal1 a=new Animal1();
		a.move();
		Dog b=new Dog();
		b.move();
		b.bark();
		

	}

}
