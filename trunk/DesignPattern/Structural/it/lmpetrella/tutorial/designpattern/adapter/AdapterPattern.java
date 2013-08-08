package it.lmpetrella.tutorial.designpattern.adapter;

/**
 * 
 * @author Martin
 *  Difference between Adapter, Decorator, Proxy and Facade design patterns
My take on four widely used and often confused design patterns - Adapter, Decorator, Proxy and Facade Patter – where are similarities and where they differ.

All four patterns have a lot in common, all four are sometimes informally called wrappers, or wrapper patterns. All use composition, wrapping subject and delegating the execution to the subject at some point, do mapping one method call to another one.

They spare client the necessity of having to construct a different object and copy over all relevant data. If used wisely, they save memory and processor.

By promoting loose coupling they make once stable code less exposed to inevitable changes and better readable for fellow developers.
Adapter
Adapter adapts subject (adaptee) class to a different interface. This way we can add object be placed to a collection of nominally different types. This way an object can be used as a parameter to a method call accepting nominally different types. An ordinary computation method can be made to run in parallel threads by a crafted Runnable Adapter or Future Adapter. All this without a single change in adaptee or client classes.

Adapter expose only relevant methods to client, can restrict all others, revealing usage intents for particular contexts. Adapters can both adapt 3rd party libraries, make them appear less general and more focused on core application business; or they can adapt our code for different needs of eternal clients. Adapters increase readability and self description of our code.

Adapters shields one team from volatile code from other teams, see Anticorruption Layer [Evans, DDD]. A life saviour tool when dealing with offshore teams :-)

Less mentioned purpose it to prevent the subject class from excess of annotations. With so many frameworks based on annotations this becomes more important usage then ever. Such annotations are often context or technology specific. On one POJO class you can end up having JAXB annotations, JPA annotations, UI annotations. They are convenient, but often breaks separation of concerns design principle.

Adapter helps to get around Java limitation of only single inheritance. It can combine several adaptees under one envelope giving impression of multiple inheritance. Adaptees in this case represents sort of Traits (as known from Scala).

Code wise, Adapter is “thin”. It should not add much code to the adaptee class, besides simply calling the adaptee method and occasional data conversions necessary to make such calls. The method mapping may not be one to one, sometimes one adapter call has to be split into several adaptee calls.

There are not many good adapter examples in JDK or basic libraries. They are common in real applications. Why? Because developers have often have to adapt 3rd party library class to do what it was not supposed to do, adapt it to custom, often very specific, application interfaces.
Decorator
Decorator not only delegates, not only maps one method to another, they do more, they modify behaviour of some subject methods. Decorator can decide not call subject method at all, but delegate the call to a different object. We call it adding a responsibility to object.

Decorators typically add (transparently) functionality to wrapped object like logging, encryption, formatting, or compression to subject. This New functionality may bring a lot of new code. Hence, decorators are usually much “fatter” then Adapters.

Decorator must be a sub-class wrapper class or interface. They can be used transparently instead of its subjects. See BufferedOutputStream, it is still OutputStream and can be used as such. That is a major technical difference from Adapters.

Decorator has the same UML diagram as Adapter, because it also wraps and delegates, but internally they do differ.

Text book examples of whole decorators family are readily in JDK - the Java IO. All classes like BufferedOutputStream, FilteredOutputStream and ObjectOutputStream are decorators of OutputStream. They can be onion layered, where one one decorator is decorated again, adding more functionality.
Proxy
Proxy is not a typical wrapper. The wrapped object, the proxy subject, may not yet exist at the time of proxy creation. Proxy often creates it internally. It may be a heavy object created on demand, or it is remote object in different JVM or different network node and even a non-Java object, a component in native code. It does not have to necessary wrap or delegate to another object at all.

Relationship between a Proxy and the real subject is typically set at compile time, Proxy instantiates it in some way, whereas Decorator or Adapter are assigned to the subject at runtime, knowing only subject's interface (see this blog).

Most typical examples are remote proxies, heavy object initializers and access proxies.

    Remote Proxy – subject is on remote server, different JVM or even non Java system.
    Proxy translates object, makes RMI, REST calls, web calls, whatever is needed, shielding client from exposure to underlying technology.
    Lazy Load Proxy – fully initialize object only the first usage, first intensive usage, especially when expensive resources are involved. This type proxy is handy where simple approach of lazy initialization holder class idiom [Joshua Bloch, Effective Java, Item 71] is not enough.
    Remote image loader (see Head First Patterns) where image can be manipulated while it is not yet fully downloaded. Object can be used even when not fully initialized.
    Access Proxy – control access to subject. For same subject can exist several access proxies for different contexts, like applets, server, local, different modules.
    Synchronisation Proxy – see [Joshua Bloch's Effective Java, Item 78]. A bit unusual proxy in its form – a nested class – and by not really delegating or wrapping, but it is proxy nevertheless, a variant of security proxy, to prevent malicious code injection when deserializing an object.

Facade
Facade is closely associated with design Principle of Least Knowledge, also known as Law of Demeter, or simply as talk to you nearest friends only.

Facade is very similar to Adapter. They both wrap, they both map one object to another, but they differ in the intent. Facade flattens complex structure of a subject, complex object graph, simplifying access to a complex structure.

Facade wraps a complex structure, providing a flat interface to it. This prevents client object from being exposed to inner relations in subject structure hence promoting loose coupling.
Often listed as an Enterprise Pattern (link).
Bridge
More complex variant of Adapter pattern where not only implementation varies but also abstraction.
It adds one more indirection to the delegation. The extra delegation is the bridge. It decouples Adapter even from adapting interface. It increases complexity more then any other of the other wrapping patterns, so apply with care.
 */

public class AdapterPattern {
	  public static void main(String[] args) {
		    System.out.println("Adapter Pattern Demonstration.");
		    System.out.println("———————————————");
		    // Create targets.
		    System.out.println("Creating targets.");
		    TargetIF target1 = new AdapterByClass();
		    TargetIF target2 = new AdapterByObject();
		    // Call target requests
		    System.out.println("Calling targets.");
		    System.out.println("target1.newRequest()->"+target1.newRequest());
		    System.out.println("target2.newRequest()->"+target2.newRequest());
		    System.out.println();
		  }
		}
