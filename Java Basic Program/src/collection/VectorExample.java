package collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		System.out.println("Capacity of vector is "+vec.capacity());
		vec.add("Suraj");
		vec.add("Payal");
		vec.add("Samruddhi");
		vec.add("Shreenika");
		System.out.println("Vector element is "+vec);
		System.out.println(vec.capacity());
		vec.add("Aasha");
		vec.add("Vilas");
		vec.add("Rani");
		vec.add("Ishita");
		vec.add("Pranita");
		vec.add("XYZ");
		vec.add("abc");
		System.out.println(vec.capacity());
		System.out.println("vector size is "+vec);
		System.out.println(vec.size());
		System.out.println(vec.get(2));
		for(String a:vec) {
			System.out.println(a);
		}
		
		
		

	}

}
