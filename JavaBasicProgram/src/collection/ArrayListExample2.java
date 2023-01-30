package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		System.out.println("List element are "+list);
		System.out.println("List of element size is "+list.size());
		Collections.sort(list);
		System.out.println("List element are "+list);
		System.out.println("List element are "+list.size());
		System.out.println("for each loop");
		list.forEach(a -> {
			System.out.println(a);
			});
		System.out.println("iterator inerface");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
 	}

}
