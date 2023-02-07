package Day04.Ex03_Car;

public class Car {

	// 멤버변수 == 필드(field)
	String model;
	private int speed;

	// 생성자
	Car() {

	}

	Car(String model) {
		this.model = model;
	}

	Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	// getter : 변수의 값을 가져오는 메소드
	// setter : 변수의 값을 지정하는 메소드

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		if (speed < 0) {
			speed = 0;
		}
		if (speed >= 300) {
			speed = 300;
		}
		this.speed = speed;

	}

}
