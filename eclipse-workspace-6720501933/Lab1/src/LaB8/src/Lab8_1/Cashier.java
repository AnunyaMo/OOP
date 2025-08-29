package Lab8_1;

public class Cashier {
	private InventoryCart inventory;
    private Card card;
    private double total;
    private double discountAmount;
    private double totalAfterDiscount;

    
    public Cashier() {
        
    }
	
	 public void doPayment(InventoryCart in, Card card) {
	        this.inventory = in;
	        this.card = card;

	        total = 0;

	        boolean[] printed = new boolean[in.getCount()];

	        for (int i = 0; i < in.getCount(); i++) {
	            if (printed[i]) continue;

	            Product p = in.getProducts()[i];
	            String detail = p.getName();
	            if (p instanceof Milk) detail += " " + ((Milk)p).getVolumn() + " CC";
	            if (p instanceof Sugar) detail += " " + ((Sugar)p).getGram() + " Gram";
	            if (p instanceof Coffee) detail += " " + ((Coffee)p).getGram() + " Gram";

	            double price = p.getPrice();
	            int count = 1;

	            for (int j = i+1; j < in.getCount(); j++) {
	                Product p1 = in.getProducts()[j];
	                String detail1 = p1.getName();
	                if (p1 instanceof Milk) detail1 += " " + ((Milk)p1).getVolumn() + " CC";
	                if (p1 instanceof Sugar) detail1 += " " + ((Sugar)p1).getGram() + " Gram";
	                if (p1 instanceof Coffee) detail1 += " " + ((Coffee)p1).getGram() + " Gram";

	                if (detail.equals(detail1) && price == p1.getPrice()) {
	                    count++;
	                    printed[j] = true;
	                }
	            }

	            total += price * count;
	        }

	        
	        discountAmount = total * card.discount() / 100.0;
	        totalAfterDiscount = total - discountAmount;
	        card.withdraw(totalAfterDiscount);
	    }
	 public void printReceipt() {
	        System.out.println("\tCARD TYPE: " + card.type());
	        System.out.println("      CARD NUMBER: " + card.getCardNumber());
	        System.out.println("\t      Pumpkin Shop");

	        boolean[] printed = new boolean[inventory.getCount()];
	        for (int i = 0; i < inventory.getCount(); i++) {
	            if (printed[i]) continue;

	            Product p = inventory.getProducts()[i];
	            String detail = p.getName();
	            if (p instanceof Milk) detail += " " + ((Milk)p).getVolumn() + " CC";
	            if (p instanceof Sugar) detail += " " + ((Sugar)p).getGram() + " Gram";
	            if (p instanceof Coffee) detail += " " + ((Coffee)p).getGram() + " Gram";

	            double price = p.getPrice();
	            int count = 1;

	            for (int j = i+1; j < inventory.getCount(); j++) {
	                Product p1 = inventory.getProducts()[j];
	                String detail1 = p1.getName();
	                if (p1 instanceof Milk) detail1 += " " + ((Milk)p1).getVolumn() + " CC";
	                if (p1 instanceof Sugar) detail1 += " " + ((Sugar)p1).getGram() + " Gram";
	                if (p1 instanceof Coffee) detail1 += " " + ((Coffee)p1).getGram() + " Gram";

	                if (detail.equals(detail1) && price == p1.getPrice()) {
	                    count++;
	                    printed[j] = true;
	                }
	            }

	            double subPrice = price * count;
	            System.out.println("     "+count + " x " + detail + " \t\t" + subPrice);
	        }

	        System.out.println("\t-------------------------");
	        System.out.println("\tCARD DISCOUNT \t" + card.discount() + " %");
	        System.out.println("\t\tTotal " + totalAfterDiscount);
	    }
	
}