
public class BankAccount {
	private double balance;
	private String name;
	private String AccountNum;

	
	
	 public BankAccount(String name, String AccountNum, double balance)
	   {
	      this.name = name;
	      this.AccountNum = AccountNum;
	      this.balance = balance;
	   }
	 
	 public String getName()
	 {
		 return name;
	 }
	 public void setName(String name)
	 {
		 this.name = name;
	 }
	 public String getAccountNum()
	 {
		 return AccountNum;
	 }
	 public void setAccountNum(String AccountNum)
	 {
		 this.AccountNum = AccountNum;
	 }
	 
	 
	 public void deposit(double amount)
	 {
	      balance = balance + amount;
	      
	 } 
	 public void withdraw(double amount)
	 {
			   balance = balance - amount;   
		   
	 }
	 public double getBalance()
	 {
	      return balance;
	 }
	 
	 public void setAcountNum(double balance)
	 {
		 this.balance = balance;
	 }
	 public String toString()
		{
			return "Name: " + getName() + ", Account Number: " + getAccountNum() + ", Balance: " + getBalance();
		}
	 

}
