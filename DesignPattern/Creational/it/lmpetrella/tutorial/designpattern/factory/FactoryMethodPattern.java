package it.lmpetrella.tutorial.designpattern.factory;

public class FactoryMethodPattern {
	  public static void main(String[] args) {
		    System.out.println("FactoryMethod Pattern Demonstration.");
		    System.out.println("覧覧覧覧覧覧覧覧覧");
		    // Create creator, which uses the FactoryMethod
		    CreatorIF creator = new ConcreteCreator();
		    // Create trade via factory method
		    TradeIF trade = creator.factoryMethod();
		    // Call trade action method
		    trade.action();
		    System.out.println();
		  }
		}