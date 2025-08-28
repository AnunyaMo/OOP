package Shop;

public class FixedSalary {
	private String firstname;
	private String lastname;
	private String cardNumber ;
	private double salary;
	private Card card;
	
	public FixedSalary(String first,String last,String cardNumber ,double salary) {
		this.firstname=first;
		this.lastname=last;
		this.salary=salary;
		this.card=new DebitCard("xxx-xxx-" + cardNumber.substring(8));
		
	}

	public Card getCard() {
		return card;
	}

	public double getSalary() {
		return salary;
	}
	
}
