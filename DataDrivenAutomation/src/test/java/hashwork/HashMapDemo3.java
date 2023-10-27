package hashwork;


import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
	                 Map<Integer, String> hMap=new HashMap<Integer, String>(); 
                     hMap.put(100, "jaideep");
                     
                     hMap.put(101, "sudeep");
                     
                     hMap.put(102, "lizze");
                     
                     System.out.println("No of Entries or keyvalues pairs"+hMap.size());
                     
                     Set<Entry<Integer, String>>  allEntries= hMap.entrySet();
                     
                    Set<Integer> allkeys =hMap.keySet();
                    
                    for(Integer key:allkeys)
                    
                    {
                    	 
                    	 System.out.println(key+"-----"+hMap.get(key));
                    }
                    
	}
}
                    
              
       


