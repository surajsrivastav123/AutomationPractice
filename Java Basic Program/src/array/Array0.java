package array;

public class Array0 {

	public static void main(String[] args) {
		String[] arrayName=new String[4];
		//String[] arrayName= {"suraj","payal","Samruddhi","Shreenika"};
		arrayName[0]="Suraj";
		arrayName[1]="Payal";
		arrayName[2]="Samruddhi";
		arrayName[3]="Shreenika";
		System.out.println(arrayName[0]);
		System.out.println("arrya size is "+arrayName.length);
		arrayName[0]="Aasha";
		/*for(int i=0; i<arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}*/
		for(String i:arrayName) {
			System.out.println(i);
		}

	}

}
