package it.lmpetrella.tutorial.designpattern.factory;

public class ConcreteCreator implements CreatorIF {
	  public TradeIF factoryMethod() {
		    return new ConcreteTrade();
		  }
		}
