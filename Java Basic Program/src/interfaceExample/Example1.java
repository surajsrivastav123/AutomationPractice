package interfaceExample;

interface Drawable{
	int salary=25;
	void draw();
}

class Rectangle1 implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle implements Drawable {
	public void draw() {
 		System.out.println("drawing circle");
	}
}


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("drawable salary is "+Drawable.salary);
		Circle a=new Circle();
		a.draw();
		Drawable b=new Rectangle1();
		b.draw();
		

	}

}
