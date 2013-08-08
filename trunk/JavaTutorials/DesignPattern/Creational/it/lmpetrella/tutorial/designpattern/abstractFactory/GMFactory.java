package it.lmpetrella.tutorial.designpattern.abstractFactory;

public class GMFactory implements AbstractFactoryIF {
	  public AbstractSportsCarIF createSportsCar() {
		    return new Corvette();
		  }
	  public AbstractEconomyCarIF createEconomyCar() {
		    return new Cavalier();
		  }
		}