
public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    // ให้ subclass override ตามต้องการ
    public void setWeight(int weight) { }
    public void setVolumn(int volume) { }

    public abstract String getDetail();
}

