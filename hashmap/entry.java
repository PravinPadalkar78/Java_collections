package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class entry {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put(101, "Pravin");
		hm.put(102, "ganesh");
		hm.put(103, "Ravin");
		hm.put(104, "Saurabh");
		hm.put(105, "Deep");
		System.out.println(hm);
		
		HashSet set = new HashSet(hm.entrySet());
		
		Iterator itr= set.iterator();
		
		while(itr.hasNext())
		{
//			System.out.println(itr.next());
			Map.Entry entry=(Map.Entry)itr.next();
			if(entry.getKey().equals(103))
			{
				entry.setValue("aaa");
			}
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	//---------------------------------------------------------------------------------------------
		//small way to iterate entry
		
		HashMap<Integer,String> hm2= new HashMap<Integer,String>();
		hm2.put(101, "Pravin");
		hm2.put(102, "ganesh");
		hm2.put(103, "Ravin");
		hm2.put(104, "Saurabh");
		hm2.put(105, "Deep");
		Collections.synchronizedMap(hm2);
		
		for(Map.Entry me:hm2.entrySet())
		{
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		
		
	}

}
