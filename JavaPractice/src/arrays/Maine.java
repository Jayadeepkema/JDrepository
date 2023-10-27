package arrays;

import java.util.ArrayList;
import java.util.List;

public class Maine {
	public static void main(String[] args) {
		List<Object> arraylist1 = new ArrayList<>();
		arraylist1.add("Steve Rogers");
		arraylist1.add(105);
		arraylist1.add('T');
		arraylist1.add(120);
		arraylist1.add(12.4562f);
		/*
		 * for(int index=0; index<=2; index++) {
		 * System.out.println(arraylist1.get(index)); }
		 */
		System.out.println("-----------------------------------");

		for (int index = 0; index < arraylist1.size(); index++)
		{
			System.out.println(arraylist1.get(index));
		}
		
        System.out.println("---------------For Each Loop-----------------------");
        
        for(Object index: arraylist1)
        {
        	System.out.println(index);
        }
        
	}

}
