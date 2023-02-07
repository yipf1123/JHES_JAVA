package Day06.Ex02_Phone;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	public void turnOn() {
		System.out.println("전원을 켭니다...");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다...");
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다...");
	}


}
