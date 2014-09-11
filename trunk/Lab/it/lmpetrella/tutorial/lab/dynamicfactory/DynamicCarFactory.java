package it.lmpetrella.tutorial.lab.dynamicfactory;

import java.util.Iterator;
import java.util.Set;

import org.reflections.Reflections;

public class DynamicCarFactory implements CarFactoryIF{

	public AbstractCar buildCar(CarModels _model) {
		String packageName = DynamicCarFactory.class.getPackage().getName();

		Reflections reflections = new Reflections(packageName);

		Set<Class<? extends AbstractCar>> allCars = reflections
				.getSubTypesOf(AbstractCar.class);

		Iterator<Class<? extends AbstractCar>> it = allCars.iterator();

		while (it.hasNext()) {
			try {
				AbstractCar car = it.next().newInstance();
				if (car.model == _model)
					return car;
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Car model " + _model.name()
				+ " not yet implemented in package " + packageName);
		return null;
	}

}
