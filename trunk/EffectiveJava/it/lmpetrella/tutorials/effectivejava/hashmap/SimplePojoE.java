package it.lmpetrella.tutorials.effectivejava.hashmap;

public class SimplePojoE {

	int attribute;
	
	public SimplePojoE(int i) {
		attribute=i;// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object _aSimplePojoE){
		if(this.attribute==((SimplePojoE)_aSimplePojoE).attribute) return true;
		else return false;
	}
	
	
}
