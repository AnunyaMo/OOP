
public class InventoryCart {

	private int count=0;
	Product[] products;
	
	public int getCount() {
		return count;
	}
	
	public Product[] getProducts() {
		return products;
	}
	
	public InventoryCart(int size) {
		products = new Product[size];
	}
	
	public void add(Product p) {
		if(count<products.length) {
			 products[count] = p;
			count++;
		}
	}
	
	public Product getProduct(int k) {
			Product product= products[k];
			products[k]=null;
		for(int i=k;i<count;i++) {
				products[i]=products[i+1];
			}
			count--;
			return products[k];
	}
	
	public Product getAllProduct() {
		Product product= products[0];
		for(int i=count;i>=0;i--) {
			products[i]=null;
		}
		return product;
	}
	

}