package Lab8_1;

public abstract class BaseAccount implements Withdrawable{
	protected double balance=0;
	
	public double getBalance() {
		return balance;
	}

	public abstract boolean deposit(double amount);
	@Override
	public abstract boolean withdraw(double amount);
}