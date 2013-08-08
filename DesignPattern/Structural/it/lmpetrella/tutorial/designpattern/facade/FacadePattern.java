package it.lmpetrella.tutorial.designpattern.facade;

public class FacadePattern {
	  public static void main(String[] args) {
		    System.out.println("Facade Pattern Demonstration.");
		    System.out.println("——————————————-");
		    // Construct and call Façade
		    System.out.println("Constructing facade.");
		    Facade façade = new Facade();
		    System.out.println("Calling facade.processOrder().");
		    façade.processOrder();
		    System.out.println();
		  }
		}
