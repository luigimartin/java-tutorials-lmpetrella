package it.lmpetrella.tutorial.lab.dynamicfactory;

public class Main {

	public static void main(String[] args) {

		System.out.println("Using switch-based factory");

		AbstractCar car1 = SwitchBasedCarFactory.buildCar(CarModels.Ferrari);
		AbstractCar car2 = SwitchBasedCarFactory
				.buildCar(CarModels.Lamborghini);
		AbstractCar car3 = SwitchBasedCarFactory.buildCar(CarModels.Maserati);
		car1.drive();
		car2.drive();

		try {
			car3.drive();
		} catch (java.lang.NullPointerException e) {
			System.out.println("Maserati wasn't built");
		}

		System.out.println("Using dynamic factory");

		AbstractCar car4 = DynamicCarFactory.buildCar(CarModels.Ferrari);
		AbstractCar car5 = DynamicCarFactory.buildCar(CarModels.Lamborghini);
		AbstractCar car6 = DynamicCarFactory.buildCar(CarModels.Maserati);
		car4.drive();
		car5.drive();
		car6.drive();

	}

}
