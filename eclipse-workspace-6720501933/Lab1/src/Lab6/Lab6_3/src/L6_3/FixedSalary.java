package L6_3;

public class FixedSalary extends Employee {
    private double salary;

    public FixedSalary(String firstName, String lastName, String phone, double salary) {
        super(firstName, lastName, phone);
        this.salary = salary;
    }

    @Override
    public double earnings() {
        return salary;
    }

    @Override
    public String toString() {
        return "Fixed Salary Employee: " + getFullName() +
               "\nPhone: " + getPhone() +
               "\nSalary: " + salary;
    }
}

