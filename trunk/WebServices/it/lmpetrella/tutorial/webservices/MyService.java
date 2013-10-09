package it.lmpetrella.tutorial.webservices;

import java.util.Arrays;

public class MyService {

		   public String echo(String message) {
			      return "Echo " + message;
			   }
			    
			   public Output sort(Input input) {
			      Arrays.sort(input.getVector());
			      return new Output(input.getVector());
			   }
		
}
