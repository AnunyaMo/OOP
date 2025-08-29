package Lab8_1;

public abstract class Card implements Withdrawable{
	private String CardNumber;
	protected SavingAccount account;
	public Card(String cardnum) {
		this.CardNumber=cardnum;
	}
	
	public String getCardNumber() {
		return CardNumber;
	}
	
	public void setAccount(SavingAccount account) {
        this.account = account;
    }
	
	public abstract String type();
	public abstract double discount();

	
}