package Day07.Ex08_UserException;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
