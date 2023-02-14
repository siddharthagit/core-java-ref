package javaexp.corejava.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaMapIterate {

	public static void main (String argv[]) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"Argentina");
		map.put(2,"France");
		map.put(3,"Brazil");
		map.put(4,"Germany");
		
		
		//EntrySet Iterator
		System.out.println("\nEntrySet foreach");
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
		    Map.Entry<Integer, String> keyVal = it.next();
			System.out.println(keyVal.getKey() + " " + keyVal.getValue());
		}
		
		//EntrySet and foreach
		System.out.println("\nEntrySet foreach");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		entrySet.forEach((e-> { System.out.println(e.getKey() + " " + e.getValue());}));
		
		
		//Keyset Iterator
		System.out.println("\nKeyset Iterator");
		Iterator<Integer> kit = map.keySet().iterator();
		while(kit.hasNext()) {
		    Integer key = kit.next();
			System.out.println(key + " " + map.get(key));
		}
		
		
		//Keyset For loop
		System.out.println("\nKeyset For loop");
		for (Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		
		
		
		//map foreach (Java 8 Lambda)
		System.out.println("\nUsing Map.foreach (Java 8 Lambda");
		map.forEach((key,value)-> {System.out.println(key + " " + value);});
	
	}
}
