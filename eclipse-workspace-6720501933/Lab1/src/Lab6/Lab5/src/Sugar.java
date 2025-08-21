
		public class Sugar extends Product {
		    private int weight; // Gram

		    public Sugar(double price) {
		        super("Sugar", price);
		    }

		    public void setWeight(int weight) {
		        this.weight = weight;
		    }

		    @Override
		    public String getDetail() {
		        return weight + " Gram";
		    }
		}


	

