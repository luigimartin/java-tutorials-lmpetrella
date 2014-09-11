package it.lmpetrella.tutorial.lab.dynamicfactory;

public class SwitchBasedCarFactory implements CarFactoryIF{

	public AbstractCar buildCar(CarModels model) {

		switch (model) {
		case Ferrari:
			return new Ferrari();
		case Lamborghini:
			return new Lamborghini();
		default:
			System.out.println("Car model " + model.name()
					+ " not yet implemented");
			return null;
		}
	}

}
