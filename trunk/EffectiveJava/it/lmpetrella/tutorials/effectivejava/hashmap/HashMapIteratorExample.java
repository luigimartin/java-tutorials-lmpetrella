//This example is going to show which are the
//best practice to iterate over HashMap

package it.lmpetrella.tutorials.effectivejava.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapIteratorExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0; i<10000; i++){
			//map.put((int) Math.round(Math.random()*10000), UUID.randomUUID().toString().substring(0, 10));
			//map.put(i, UUID.randomUUID().toString().substring(0, 10));
			map.put(i, String.valueOf(i));
			//System.out.println("key: " + i + " value: " + map.get(i));
		}
		
		Iterator<Integer> keySetIterator = map.keySet().iterator();
		
		while(keySetIterator.hasNext()){
		  Integer key = keySetIterator.next();
		  System.out.println("key: " + key + " value: " + map.get(key));
		}


	}

}
