package it.lmpetrella.tutorial.designpattern.facade;

public class FacadePattern {
	  public static void main(String[] args) {
		    System.out.println("Facade Pattern Demonstration.");
		    System.out.println("��������������-");
		    // Construct and call Fa�ade
		    System.out.println("Constructing facade.");
		    Facade fa�ade = new Facade();
		    System.out.println("Calling facade.processOrder().");
		    fa�ade.processOrder();
		    System.out.println();
		  }
		}
