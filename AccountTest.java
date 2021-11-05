
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount nina = new BankAccount("Nina Master", "0001", 1000.00);
		CheckingAccount john = new CheckingAccount("John Smith", "0002", 500.00);
		SavingAccount amy = new SavingAccount("Amy Smith", "0003", 15000.00, 3.5);
		
		System.out.println(nina);
		System.out.println(john);
		System.out.println(amy);
		
		john.deposit(10000);
		
		double averageBal = ((500*15) + (john.getBalance()*15))/30;
		john.MonthEnd(averageBal);
		System.out.println(averageBal);
		
		amy.withdraw(5000);
		averageBal = ((15000*20) + (10000*10))/30;
		amy.MonthEnd(averageBal);
		
		System.out.println(nina);
		System.out.println(john);
		System.out.println(amy);
	}

}
