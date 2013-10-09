package it.lmpetrella.tutorial.webservices;

public class Input {

	   public int[] getVector() {
		return vector;
	}



	public void setVector(int[] vector) {
		this.vector = vector;
	}



	private int[] vector;
		 
	   public Input() {
	   }

	    

	   public Input(int... numbers) {
		   this.vector = numbers;
	   }
//Getter & Setter
	   
}
