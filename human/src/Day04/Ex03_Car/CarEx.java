package Day04.Ex03_Car;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.model = "제네시스";
		// car.speed = -100;		
		
		car.setSpeed(-100);
		System.out.println("model: " + car.getModel());
		System.out.println("model: " + car.getSpeed());

		car.setSpeed(500);
		System.out.println("model: " + car.getSpeed());
	
		car.setSpeed(80);
		System.out.println("model: " + car.getSpeed());
	
	
	}
	
}
