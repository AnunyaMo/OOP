package L6_3;

public class CommissionPay extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionPay(String firstName, String lastName, String phone,
                         double grossSales, double commissionRate) {
        super(firstName, lastName, phone);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return "Commission Employee: " + getFullName() +
               "\nPhone: " + getPhone() +
               "\nGross Sales: " + grossSales + " Rate: " + commissionRate;
    }
}
