package it.lmpetrella.tutorial.designpattern.adapter;

public class AdapterByClass extends Adaptee implements TargetIF {
	  public AdapterByClass() {
		    System.out.println("AdapterByClass constructed.");
		  }
		  public String newRequest() {
		    return oldRequest();
		  }
		}