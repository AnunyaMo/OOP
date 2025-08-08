package Lab6;

public class Graduate extends Student{

	private String thesisTitle;
	
	
	public Graduate(int id,String n,double gpa,String thesis) {
		super(id,n,gpa);
		thesisTitle=thesis;
	}
	
	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle=thesisTitle;
	}
	
	public String getThesisTitle() {
		return thesisTitle;
	}
	@Override
	public String toString() {
		return super.toString()+"\nThesis:"+thesisTitle;
	}
}
