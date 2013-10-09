package it.lmpetrella.tutorial.webservices;

public class Output {

		   public int[] getSortedVector() {
		return sortedVector;
	}

	public void setSortedVector(int[] sortedVector) {
		this.sortedVector = sortedVector;
	}

		private int[] sortedVector;
		    
		   public Output() {
		   }
		    
		   public Output(int... numbers) {
		      this.sortedVector = numbers;
		   }
		 
		//Getter & Setter
	
}
