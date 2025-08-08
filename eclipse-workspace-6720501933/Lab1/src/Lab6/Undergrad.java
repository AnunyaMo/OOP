package Lab6;

public class Undergrad extends Student{

	private String year;
	
	
	public Undergrad(int id,String n,double gpa,String string) {
		super(id,n,gpa);
		year=string;
	}
	
	public void setYear(String year) {
		this.year=year;
	}
	
	public String getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "Undergraduate   "+super.toString();
	}
}
