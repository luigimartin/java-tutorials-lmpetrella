package it.lmpetrella.tutorial.designpattern.strategy;

public class ConcreteStrategy1 implements StrategyIF {
	  // Switch text to all upper case.
	  public void algorithmInterface(String parm) {
	    System.out.println(parm.toUpperCase());
	  }
	}
