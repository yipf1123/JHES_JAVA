package Day04.Class;

public class Pikachu {

	//변수
	public int energy; //  값을 지정하지 않은면 0
	public String type; // 값을 지정하지 않으면 null
	
	public Pikachu() {
		this (100, "전기");
		//energy = 100;
		//type = "전기";
	}
	
	
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}


	//public Pikachu(int energy, String type) {
	// this : 객체 자기 자신을 가르키는 레퍼런스
 	//this.energy = energy;
	//this.type  = type;
	//}

	
	
	

	//메소드
	public String aAttack() {
		return "십만볼트";
	}

	public String bAttack() {
		return "전광석화";
	}


	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	 
	
}
