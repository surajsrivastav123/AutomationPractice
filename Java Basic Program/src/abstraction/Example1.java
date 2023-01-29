package abstraction;

abstract class Bike1{
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed is "+spd);
	}
}

class Honda4 extends Bike1{
	void run() {
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda speed is "+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("Honda color is red");
	}
}

public class Example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Honda4 a=new Honda4();
		a.run();
		a.speed(60);
		a.color();
		Bike1 b=new Honda4();
		b.run();
		b.speed(20);
	}

}
