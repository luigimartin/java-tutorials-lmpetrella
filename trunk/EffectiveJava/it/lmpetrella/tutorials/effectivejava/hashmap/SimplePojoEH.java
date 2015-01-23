package it.lmpetrella.tutorials.effectivejava.hashmap;

public class SimplePojoEH {

	int attribute;
	
	public SimplePojoEH(int i) {
		attribute=i;// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object _aSimplePojoEH){
		if(this.attribute==((SimplePojoEH)_aSimplePojoEH).attribute) return true;
		else return false;
	}
	
	@Override
	public int hashCode(){return attribute;}
	
}
