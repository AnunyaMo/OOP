package L6_3;

public class HourlySalary extends Employee {
    private double wage;
    private int hours;

    public HourlySalary(String firstName, String lastName, String phone, double wage, int hours) {
        super(firstName, lastName, phone);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "Hourly Employee: " + getFullName() +
               "\nPhone: " + getPhone() +
               "\nWage: " + wage + " Hours: " + hours;
    }
}
