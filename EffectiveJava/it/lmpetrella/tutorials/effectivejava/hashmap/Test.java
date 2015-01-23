package it.lmpetrella.tutorials.effectivejava.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
	
		Map<SimplePojo,String> hm = new HashMap<SimplePojo,String>();
		SimplePojo simple1= new SimplePojo(1);
		SimplePojo simple2= new SimplePojo(1);
		hm.put(simple1, "1");
		System.out.println(simple1.equals(simple2));
		System.out.println(hm.get(simple2)+"\n");
		
		Map<SimplePojoE,String> hmE = new HashMap<SimplePojoE,String>();
		SimplePojoE simpleE1= new SimplePojoE(1);
		SimplePojoE simpleE2= new SimplePojoE(1);
		hmE.put(simpleE1, "1");
		System.out.println(simpleE1.equals(simpleE2));
		System.out.println(hmE.get(simpleE2)+"\n");
		
		Map<SimplePojoEH,String> hmEH = new HashMap<SimplePojoEH,String>();
		SimplePojoEH simpleEH1= new SimplePojoEH(1);
		SimplePojoEH simpleEH2= new SimplePojoEH(1);
		hmEH.put(simpleEH1, "1");
		System.out.println(simpleEH1.equals(simpleEH2));
		System.out.println(hmEH.get(simpleEH2));

	}
}
