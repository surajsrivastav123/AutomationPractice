package collection;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(3);
		System.out.println("list of element is "+list);
		System.out.println("List element size is "+list.size());
		List<Integer> list2=new ArrayList<Integer>();
		for(int i=0; i<list.size();i++) {
			//System.out.println(list.get(i));
			int x;
			if(!list2.contains(list.get(i))) {
				x=list.get(i);
				list2.add(x);
			}
			
			
		}
		System.out.println("list2 element is "+list2);
	}

}
