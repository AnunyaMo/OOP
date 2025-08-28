package Shop;

public class Sugar extends Product{
	private int Gram;
		
		public Sugar(double price) {
			super("Sugar",price);
		}
		
		@Override
		public void setWeight(int w) {
			this.Gram= w;
		}

		public int getGram() {
			return Gram;
		}

	
}
