package Lab8_1;

public class Coffee extends Product{
	private int Gram;
	
	public Coffee(double price) {
		super("Coffee",price);
	}
	
	@Override
	public void setWeight(int w) {
		this.Gram= w;
	}

	public int getGram() {
		return Gram;
	}

	
}
