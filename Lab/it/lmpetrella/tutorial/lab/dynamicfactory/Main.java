package it.lmpetrella.tutorial.lab.dynamicfactory;

public class Main {

	public static void main(String[] args) {

		System.out.println("Using switch-based factory");

		SwitchBasedCarFactory switchBasedCarFactory= new SwitchBasedCarFactory();
		AbstractCar car1 = switchBasedCarFactory.buildCar(CarModels.Ferrari);
		AbstractCar car2 = switchBasedCarFactory
				.buildCar(CarModels.Lamborghini);
		AbstractCar car3 = switchBasedCarFactory.buildCar(CarModels.Maserati);
		car1.drive();
		car2.drive();

		try {
			car3.drive();
		} catch (java.lang.NullPointerException e) {
			System.out.println("Maserati wasn't built");
		}

		System.out.println("Using dynamic factory");

		DynamicCarFactory dynamicCarFactory= new DynamicCarFactory();
		AbstractCar car4 = dynamicCarFactory.buildCar(CarModels.Ferrari);
		AbstractCar car5 = dynamicCarFactory.buildCar(CarModels.Lamborghini);
		AbstractCar car6 = dynamicCarFactory.buildCar(CarModels.Maserati);
		car4.drive();
		car5.drive();
		car6.drive();

	}

}
