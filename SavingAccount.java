
public class SavingAccount extends BankAccount {
	double interest = 0;
	double interests = 0;

	SavingAccount(String name, String AccountNum, double balance, double interest)
	{
		super(name, AccountNum, balance);
		this.interest = interest/100;
	}  
	
	
	void MonthEnd(double averageDailyBalance)
	{
		deposit(averageDailyBalance * interest);
	}
	
	public double getInterest()
	{
		return interest;
	}
	
	public void setInterest(double interest)
	{
		this.interest = interest;
	}
	
	public String toString()
	{
		interest = getInterest();
		return "Name: " + getName() + ", Account Number: " + getAccountNum() + ", Balance: " + getBalance() + ", Interest Rate: " + getInterest();
	}
	
}
