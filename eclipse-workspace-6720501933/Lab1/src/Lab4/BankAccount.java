package Lab4;

public class BankAccount {
	private String name;
	private double balance;

	public BankAccount(String name) {
		this.name=name;
		this.balance=0;
	}
	
	public BankAccount(String name,double amount) {
		this.name=name;
		this.balance=amount;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public boolean withdraw(double amount) {
		if(amount<=balance)
		{
			balance-=amount;
			return true;
		}
		return false;
	}
	
	public void transfer(BankAccount other,double amount) {
		if(withdraw(amount))
		{
			other.deposit(amount);
		}
	}

	public double getBalance() {
		return balance;
	}
	
	public String getInfo()
	{
		return "Account:"+name+"|Balance:"+balance;
	}
	
	

}
