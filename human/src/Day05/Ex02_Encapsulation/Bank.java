package Day05.Ex02_Encapsulation;

public class Bank {

	public static void main(String[] args) {
		
	Encapsulation ec
	 = new Encapsulation(0, "국민은행", " 91043621120", "이은솔");
	
	ec.setDeposit(100000000);
	
	int money = ec.getDeposit();
	System.out.println(ec);
	 		System.out.println("계좌 잔액 : " + money);
			 
	}
	
}
