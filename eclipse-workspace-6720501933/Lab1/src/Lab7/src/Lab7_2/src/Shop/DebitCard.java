package Shop;

public class DebitCard extends Card{
	
	public DebitCard(String Cardnum) {
		super(Cardnum);
	}

	@Override
	public boolean withdraw(double amount) {
		return true;
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
