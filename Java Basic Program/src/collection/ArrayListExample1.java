package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls1=new ArrayList();
		System.out.println("is list empty "+ls1.isEmpty());
		ls1.add("Pune");
		ls1.add(25);
		ls1.add("Pune");
		ls1.add(null);
		System.out.println("List1 element are "+ls1);
		System.out.println("is list empty "+ls1.isEmpty());
		ls1.add(1, "Mumbai");
		System.out.println("List1 element are "+ls1);
		ls1.set(3, "Delhi");
		System.out.println("List1 element are "+ls1);
		List ls2=new ArrayList();
		ls2.add("Deccan");
		ls2.add("VimanNagar");
		ls2.add("Hinjewadi");
		System.out.println("List2 element are "+ls2);
		ls2.addAll(ls1);
		System.out.println("List2 element are "+ls2);
		List ls3 =new ArrayList();
		ls3.add("Red");
		ls3.add("pink");
		ls3.add("Black");
		System.out.println("List3 element are "+ls3);
		ls3.addAll(1,ls1);
		System.out.println("List3 element are "+ls3);
		System.out.println("List3 element are "+ls3.get(2));
		System.out.println("List3 element are "+ls3.size());
		for(int i=0; i<ls3.size();i++) {
			System.out.println("Element at index "+i+":"+ls3.get(i));
		}
		System.out.println("*********************************");
		for(Object obj:ls3) {
			System.out.println(obj);
		}
		
		System.out.println("*********************************");
		List ls4=new ArrayList();
		ls4.add("Apple");
		ls4.add("Orange");
		ls4.add("Banana");
		ls4.add("Grapes");
		System.out.println("List4 element are "+ls4);
		Iterator itr=ls4.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("**************");
		Iterator itr1=ls3.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

		
		
		

	}

}
