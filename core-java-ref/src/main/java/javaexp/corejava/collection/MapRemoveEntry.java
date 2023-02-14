package javaexp.corejava.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapRemoveEntry {

	public static void main(String argv[]) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;

			protected boolean removeEldestEntry(Map.Entry<Integer,String> eldest) {
				return size() > 4;
	
			}
		};
		
		map.put(0, "A");
		map.put(1, "B");
		map.put(2, "C");
		map.put(3, "D");
		map.put(4, "E");
		//map.put(5, "F");
		
		map.forEach((k,v) -> { System.out.println("key = " + k + " value = " + v);});
	}
}
