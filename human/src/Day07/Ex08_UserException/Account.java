package Day07.Ex08_UserException;

public class Account {

	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceException {
		if(balance < money) {
			throw new BalanceException("잔고가 부족합니다." + (money-balance)+ "원이 부족합니다.");
		}
	balance -= money;
	}
	
	
}
