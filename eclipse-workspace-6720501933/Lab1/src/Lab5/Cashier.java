package Lab5;

public class Cashier {
	private String Name;
	
	public Cashier(String Name) {
		this.Name=Name;
	}
	
	public String getName() {
		return Name;
	}
	
	public void printReceipt(InventoryCart c) {
		System.out.print("\t\tPumpkin Shop ("+Name+")\n");
		double total=0;
		for(int i=0;i < c.getCount();i++) {
			Product b = c.getProducts()[i];
			System.out.print("\t1 x "+b.getName()+"\t("+b.getCode()+")\t"+b.getPrice()+"\n");
			total+=b.getPrice();
		}
		System.out.print("\t\t---------------------\n\t\t\tTotal\t\t"+total+"$");
	}


}
