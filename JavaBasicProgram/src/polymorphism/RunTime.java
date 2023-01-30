package polymorphism;

class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class dog extends Animal {
	void eat() {
		System.out.println("dog Eat meat");
	}
}
class cat extends Animal {
	void eat() {
		System.out.println("cat Eat rat and milk");
	}
}
class goat extends Animal {
	void eat() {
		System.out.println("goat Eat grass");
	}
}

public class RunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A=new Animal();
		A.eat();
		Animal B=new cat();
		B.eat();
		Animal G=new goat();
		G.eat();

	}

}
