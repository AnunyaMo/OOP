package L6_3;


	public abstract class Employee {
	    private String firstName;
	    private String lastName;
	    private String phone;

	    public Employee(String firstName, String lastName, String phone) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phone = phone;
	    }

	    public String getFullName() {
	        return firstName + " " + lastName;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    // เมธอด abstract ต้องให้ subclass implement
	    public abstract double earnings();

	    @Override
	    public String toString() {
	        return String.format("%s\nPhone: %s", getFullName(), getPhone());
	    }
	}

