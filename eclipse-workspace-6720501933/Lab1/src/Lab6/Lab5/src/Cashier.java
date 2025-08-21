
import java.util.*;

public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void printReceipt(InventoryCart c) {
        System.out.println("-------------------------------------");
        System.out.println("Pumpkin Shop (" + name + ")");
        
        double total = 0;

        // รวมสินค้าที่เหมือนกัน
        Map<String, Integer> qtyMap = new HashMap<>();
        Map<String, Double> priceMap = new HashMap<>();
        Map<String, String> detailMap = new HashMap<>();

        for (int i = 0; i < c.getCount(); i++) {
            Product p = c.getProducts()[i];
            String key = p.getName() + " " + p.getDetail();

            qtyMap.put(key, qtyMap.getOrDefault(key, 0) + 1);
            priceMap.put(key, p.getPrice());
            detailMap.put(key, p.getDetail());
        }

        for (String key : qtyMap.keySet()) {
            int qty = qtyMap.get(key);
            double price = priceMap.get(key);
            String name = key.split(" ")[0];
            String detail = detailMap.get(key);

            System.out.println(qty + " x " + name + " " + detail + " " + (price * qty));
            total += price * qty;
        }

        System.out.println("-------------------------------------");
        System.out.println("Total " + total + " $");
    }
}
