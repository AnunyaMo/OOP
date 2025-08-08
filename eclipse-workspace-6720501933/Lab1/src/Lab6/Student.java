package Lab6;

public class Student {

	protected String name;
	protected int Id;
	protected double Gpa;
	
	public Student(int id,String n,double gpa) {
		name = n;
		Id = id;
		Gpa = gpa;
	}
	
	public Student(int id,double gpa) {
		Id = id;
		Gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return Id;
	}
	
	public double getGpa() {
		return Gpa;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String toString() {
		return "Student:\nID:"+Id+"\nName:"+name+"\nGPA:"+Gpa;
	}

	

}
