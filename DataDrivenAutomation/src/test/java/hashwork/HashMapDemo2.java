package hashwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
	                 Map<Integer, String> hMap=new HashMap<Integer, String>(); 
                     hMap.put(100, "jaideep");
                     
                     hMap.put(101, "sudeep");
                     
                     hMap.put(102, "taniya");
                     
                     System.out.println("No of Entries or keyvalues pairs"+hMap.size());
                     
                     Set<Entry<Integer, String>>  allEntries= hMap.entrySet();
                     
                     Entry<Integer, String> entry=null;
                     
                     //iterator
                     
                     Iterator<Entry<Integer, String>> it= allEntries.iterator();
                     
                     while(it.hasNext())
                     {
                    	 
                    	entry= it.next();
                    	 
                    	 System.out.println(entry.getKey()+"-----"+entry.getValue());
                     }
	}           

}
