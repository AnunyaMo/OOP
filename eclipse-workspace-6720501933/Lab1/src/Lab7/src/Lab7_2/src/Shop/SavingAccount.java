package Shop;

public class SavingAccount extends BaseAccount{
	public Card c;
	
	public SavingAccount(FixedSalary em) {
		super();
		this.c=em.getCard();
	}
	
	@Override
	public  boolean deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		if(amount<=balance&&amount>0) {
			balance-=amount;
			return true;
		
		}
		return false;
	}
}
