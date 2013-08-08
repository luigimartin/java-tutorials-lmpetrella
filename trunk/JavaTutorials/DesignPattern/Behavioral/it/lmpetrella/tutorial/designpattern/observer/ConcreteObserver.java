package it.lmpetrella.tutorial.designpattern.observer;

public class ConcreteObserver implements ObserverIF {
	  private ConcreteSubject subject; // Reference to subject
	  public void update() {
	    //if (subject == null) { subject = new ConcreteSubject(); } // istruzine inutile in questa implementazione
	    System.out.print("         Yes!");
	  }
	}