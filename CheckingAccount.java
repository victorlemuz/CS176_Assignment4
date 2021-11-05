
public class CheckingAccount extends BankAccount{

	CheckingAccount(String name, String AccountNum, double balance)
	{
		super(name, AccountNum, balance);
	}
	
	
	void MonthEnd(double averageDailyBalance)
	{
		if(getBalance()<1500)
		{
			withdraw(20);
		}
	}
}
