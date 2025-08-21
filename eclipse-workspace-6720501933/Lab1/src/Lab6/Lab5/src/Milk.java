
		public class Milk extends Product {
		    private int volume; // CC

		    public Milk(double price) {
		        super("Milk", price);
		    }

		    public void setVolumn(int volume) {
		        this.volume = volume;
		    }

		    @Override
		    public String getDetail() {
		        return volume + " CC";
		    }
		}

	


