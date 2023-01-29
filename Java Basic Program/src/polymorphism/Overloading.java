package polymorphism;

class Shapes{
	public void area() {
		System.out.println("find area ");
	}
	
	public void area(int r) {
		System.out.println("area of circle is "+3.14*r*r);
	}
	public void area(double h, double b) {
		System.out.println("area of traingle is "+0.5*b*h);
	}
	public void area(int l, int h) {
		System.out.println("area of rectangle is "+l*h);
		
	}
}


public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes myshape=new Shapes();
		myshape.area();
		myshape.area(3.0,50.50);
		myshape.area(50);
		myshape.area(20,30);
		

	}

}
