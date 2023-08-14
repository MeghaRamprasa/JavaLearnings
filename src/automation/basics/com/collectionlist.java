package automation.basics.com;

import java.util.ArrayList;
import java.util.List;

public class collectionlist {

	public static void main(String[] args) {
		List<Integer> List1 = new ArrayList<Integer>();
		
		List1.add(10);
		List1.add(20);
		List1.add(30);
		List1.add(40);
		List1.add(50);
		List1.add(60);
		
		List<Integer> List2 = new ArrayList<Integer>();
		
		List2.add(20);
		List2.add(40);
		
		List1.remove(1);
		System.out.println(List1.containsAll(List2));
		
		for(int i=0;i<List1.size();i++)
		{
			System.out.println("value of list1 " +List1.get(i));
		}

	}

}
