package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car 
{
	private String name;
	private static int carCount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCarCount() {
		return carCount;
	}

	public static void setCarCount(int carCount) {
		Car.carCount = carCount;
	}

	public Car() {
		carCount++;
	}



	public static void main(String[] args) 
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Car.xml");
		Car car = (Car) appContext.getBean("expensiveCar");
		System.out.println("Total cars:" + Car.getCarCount());
	}
}
