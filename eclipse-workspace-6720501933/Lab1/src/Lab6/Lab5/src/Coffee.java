
	public class Coffee extends Product {
	    private int weight; // Gram

	    public Coffee(double price) {
	        super("Coffee", price);
	    }

	    public void setWeight(int weight) {
	        this.weight = weight;
	    }

	    @Override
	    public String getDetail() {
	        return weight + " Gram";
	    }
	}



