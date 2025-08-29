package Lab8_1;

public class FixedSalary {
	private String firstname;
    private String lastname;
    private String cardNumber;
    private double salary;
    private SavingAccount acc;
    private Card card;

    public FixedSalary(String first, String last, String cardNumber, double salary) {
        this.firstname = first;
        this.lastname = last;
        this.cardNumber = cardNumber;
        this.salary = salary;

        this.card = new SavingAccount.DebitCard(cardNumber); 
        this.acc = new SavingAccount(this.card);
        ((SavingAccount.DebitCard) this.card).setAccount(this.acc);
    }

	public SavingAccount getAcc() {
		return acc;
	}
	public Card getCard() {
		return acc.getC();
	}

	public double getSalary() {
		return salary;
	}
	
}