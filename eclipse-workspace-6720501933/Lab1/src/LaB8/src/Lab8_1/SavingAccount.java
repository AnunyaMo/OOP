package Lab8_1;

public class SavingAccount extends BaseAccount{
	public Card c;
	private static double sharedBalance = 0;
	
	public SavingAccount(Card card) {
	    this.c = card;
	    card.setAccount(this); 
	}

	 public SavingAccount(FixedSalary em) {
	        this(em.getCard());
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

	public Card getC() {
		return c;
	}

	public static class DebitCard extends Card{
		
		public DebitCard(String Cardnum) {
			super(Cardnum);
		}

		@Override
		public boolean withdraw(double amount) {
			return account.withdraw(amount);
		}

		@Override
		public String type() {
			return "visa";
		}

		@Override
		public double discount() {
			return 2.5;
		}
		
	} 
	
}
