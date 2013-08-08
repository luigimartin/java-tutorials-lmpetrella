package it.lmpetrella.tutorial.designpattern.singleton;
/*
 * Singletons really are "per classloader" and
 * in a J2EE application, many developers make
 * the mistake of assuming that a singleton really
 * is a singleton in a cluster of application servers.
 * This is not true!
*/

public final class Singleton {
	  private static Singleton instance; // Nota PRIVATE e STATIC
	  private int value;
	  private Singleton() {System.out.println("Singleton constructed.");} // Costruttore PRIVATE
	  public static synchronized Singleton getInstance() {  //Metodo STATIC e SYNCHRONIZED
	  // if it has not been instantiated yet
	  if (instance == null)
	    // instantiate it here
	    instance = new Singleton();
	  return instance;
	  }
	  // remaining methods are for demo purposes
	  // your singleton would have it’s business
	  // methods here...
	  public String getInfo() {
	    return getClass().getName() +
	      // Uncomment line below to also see the loader
	      //+", loaded by " + getClass().getClassLoader();
	      ", id#" + System.identityHashCode(this);
	  }
	  public int getValue() {return value;}
	  public void setValue(int parm) {value = parm;}
	  public boolean equals(Singleton parm) {
	    return (System.identityHashCode(this)
	      == System.identityHashCode(parm));
	  }
	}