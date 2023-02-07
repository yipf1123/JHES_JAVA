package Day04.Class;

//            자식     상속      부모
public class Raichu extends Pikachu{

	public Raichu() {
		super(200,"슈퍼전기파워");
	}

	public Raichu(int energy, String type) {
		super(energy, type);
	}
	// 메소드 오버라이딩 : 매소드 재정의
//	public String aAttack() {
//		return "백만볼트";
//		
//	}
	

	@Override
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}

	
	
	
}
