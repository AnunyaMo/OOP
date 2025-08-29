package Lab8_1;

public class Milk extends Product{
	private int CC;
	
	public Milk(double price) {
		super("Milk",price);
	}
	
	@Override
	public void setVolumn(int vol) {
		this.CC= vol;
	}

	public int getVolumn() {
		return CC;
	}


	
}
