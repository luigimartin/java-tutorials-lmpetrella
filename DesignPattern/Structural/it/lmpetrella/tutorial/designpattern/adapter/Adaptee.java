package it.lmpetrella.tutorial.designpattern.adapter;

public class Adaptee {
	  public Adaptee() {
		    System.out.println("Adaptee constructed.");
		  }
		  public String oldRequest() {
		    return "Adaptee.oldRequest() called.";
		  }
		}