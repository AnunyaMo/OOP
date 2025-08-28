package Shop;

public abstract class Card implements Withdrawable{
	private String CardNumber;
	public Card(String cardnum) {
		this.CardNumber=cardnum;
	}
	
	public String getCardNumber() {
		return CardNumber;
	}
	
	public abstract String type();
	public abstract double discount();

	
}
