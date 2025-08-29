package Lab8_1;

public class InventoryCart {
	private Product[] products;
	public int count=0;
	
	public InventoryCart(int num) {
		products = new Product[num];
	}
	
	public void add(Product p) {
		if(count<products.length)
			products[count]=p;
		count++;
	}
	
	public Product getProduct(int k) {
		Product p = products[k];
		for(int i=k;i<count;i++) {
			products[i]=products[i++];
		}
		products[count-1]=null;
		count--;
		return p;
	}

	public int getCount() {
		return count;
	}

	public Product[] getProducts() {
		return products;
	}


}
