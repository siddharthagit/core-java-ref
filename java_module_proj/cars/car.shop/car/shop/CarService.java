package car.shop;


import car.common.model.Car;

public class CarService {

	public static void main(String[] args) {
		Car car = new Car();
		changeTire(car);
	}

	public static void changeTire(car.common.model.Car car) {
		System.out.println("Car Service");
	}

}
