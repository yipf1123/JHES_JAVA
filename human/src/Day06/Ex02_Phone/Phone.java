package Day06.Ex02_Phone;

public abstract class Phone {

	// 변수
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	abstract public void turnOn();
	abstract public void turnOff();
	
}
