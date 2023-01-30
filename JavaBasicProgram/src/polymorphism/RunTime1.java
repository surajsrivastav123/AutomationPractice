package polymorphism;

class Bank {
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICI extends Bank {
	float getRateOfInterest() {
		return 7.3f;
	}
}
class AXIS extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}
public class RunTime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new SBI();
		System.out.println("SBI rate of interest is "+b.getRateOfInterest());

	}

}
