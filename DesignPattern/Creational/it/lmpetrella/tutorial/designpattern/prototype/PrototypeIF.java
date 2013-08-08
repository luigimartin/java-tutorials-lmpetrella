package it.lmpetrella.tutorial.designpattern.prototype;

public interface PrototypeIF {
	  public PrototypeIF getClone(); // as opposed to Object.clone()
	  public void action();
	}