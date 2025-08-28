package Shop;

public abstract class BaseAccount implements Withdrawable{
	protected double balance=0;
	public abstract boolean deposit(double amount);
}
