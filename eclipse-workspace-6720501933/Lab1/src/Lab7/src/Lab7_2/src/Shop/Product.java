package Shop;

public class Product {
	private String name;
	private double price;

	
	public Product(String name,double price) {
		this.name=name;
		this.price=price;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}

    public void setWeight(int weight) { }
    public void setVolumn(int volume) { }


	

}
