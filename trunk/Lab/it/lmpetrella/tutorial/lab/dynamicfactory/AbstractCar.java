package it.lmpetrella.tutorial.lab.dynamicfactory;

public abstract class AbstractCar {

	protected CarModels model;

	public void drive() {
		System.out.println("You are driving a " + model.name());
	}

}
